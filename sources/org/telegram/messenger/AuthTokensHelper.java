package org.telegram.messenger;

import android.content.SharedPreferences;
import androidx.recyclerview.widget.DiffUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

public class AuthTokensHelper {
    public static void addLogOutToken(TLRPC.TL_auth_loggedOut tL_auth_loggedOut) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        int i = sharedPreferences.getInt("count", 0);
        SerializedData serializedData = new SerializedData(tL_auth_loggedOut.getObjectSize());
        tL_auth_loggedOut.serializeToStream(serializedData);
        sharedPreferences.edit().putString(DiffUtil.m(i, "log_out_token_"), Utilities.bytesToHex(serializedData.toByteArray())).putInt("count", i + 1).apply();
        BackupAgent.requestBackup();
    }

    public static void clearLogInTokens() {
        ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens_login", 0).edit().clear().apply();
        ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0).edit().clear().apply();
    }

    public static ArrayList<TLRPC.TL_auth_authorization> getSavedLogInTokens() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens_login", 0);
        int i = sharedPreferences.getInt("count", 0);
        if (i == 0) {
            return null;
        }
        ArrayList<TLRPC.TL_auth_authorization> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("log_in_token_" + i2, "")));
                TLRPC.auth_Authorization auth_authorizationTLdeserialize = TLRPC.auth_Authorization.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (auth_authorizationTLdeserialize instanceof TLRPC.TL_auth_authorization) {
                    arrayList.add((TLRPC.TL_auth_authorization) auth_authorizationTLdeserialize);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return arrayList;
    }

    public static ArrayList<TLRPC.TL_auth_loggedOut> getSavedLogOutTokens() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        int i = sharedPreferences.getInt("count", 0);
        if (i == 0) {
            return null;
        }
        ArrayList<TLRPC.TL_auth_loggedOut> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("log_out_token_" + i2, "")));
            TLRPC.TL_auth_loggedOut tL_auth_loggedOutTLdeserialize = TLRPC.TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (tL_auth_loggedOutTLdeserialize != null) {
                arrayList.add(tL_auth_loggedOutTLdeserialize);
            }
        }
        return arrayList;
    }

    public static void saveLogInToken(TLRPC.TL_auth_authorization tL_auth_authorization) {
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("saveLogInToken ".concat(new String(tL_auth_authorization.future_auth_token, StandardCharsets.UTF_8)));
        }
        ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = getSavedLogInTokens();
        if (savedLogInTokens == null) {
            savedLogInTokens = new ArrayList<>();
        }
        savedLogInTokens.add(0, tL_auth_authorization);
        saveLogInTokens(savedLogInTokens);
    }

    private static void saveLogInTokens(ArrayList<TLRPC.TL_auth_authorization> arrayList) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens_login", 0);
        ArrayList arrayList2 = new ArrayList();
        sharedPreferences.edit().clear().apply();
        for (int i = 0; i < Math.min(20, arrayList.size()); i++) {
            arrayList2.add(arrayList.get(i));
        }
        if (arrayList2.size() > 0) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt("count", arrayList2.size());
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_authorization) arrayList2.get(i2)).getObjectSize());
                ((TLRPC.TL_auth_authorization) arrayList2.get(i2)).serializeToStream(serializedData);
                editorEdit.putString("log_in_token_" + i2, Utilities.bytesToHex(serializedData.toByteArray()));
            }
            editorEdit.apply();
            BackupAgent.requestBackup();
        }
    }

    public static void saveLogOutTokens(ArrayList<TLRPC.TL_auth_loggedOut> arrayList) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        ArrayList arrayList2 = new ArrayList();
        sharedPreferences.edit().clear().apply();
        System.currentTimeMillis();
        for (int i = 0; i < Math.min(20, arrayList.size()); i++) {
            arrayList2.add(arrayList.get(i));
        }
        if (arrayList2.size() > 0) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt("count", arrayList2.size());
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_loggedOut) arrayList2.get(i2)).getObjectSize());
                ((TLRPC.TL_auth_loggedOut) arrayList2.get(i2)).serializeToStream(serializedData);
                editorEdit.putString("log_out_token_" + i2, Utilities.bytesToHex(serializedData.toByteArray()));
            }
            editorEdit.apply();
        }
    }
}
