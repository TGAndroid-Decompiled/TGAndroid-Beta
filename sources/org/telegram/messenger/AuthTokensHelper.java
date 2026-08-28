package org.telegram.messenger;

import android.content.SharedPreferences;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public class AuthTokensHelper {
    public static void addLogOutToken(TLRPC.TL_auth_loggedOut tL_auth_loggedOut) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        int i9 = sharedPreferences.getInt("count", 0);
        SerializedData serializedData = new SerializedData(tL_auth_loggedOut.getObjectSize());
        tL_auth_loggedOut.serializeToStream(serializedData);
        sharedPreferences.edit().putString(j3.r0.l(i9, "log_out_token_"), Utilities.bytesToHex(serializedData.toByteArray())).putInt("count", i9 + 1).apply();
        BackupAgent.requestBackup();
    }

    public static void clearLogInTokens() {
        ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens_login", 0).edit().clear().apply();
        ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0).edit().clear().apply();
    }

    public static ArrayList<TLRPC.TL_auth_authorization> getSavedLogInTokens() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens_login", 0);
        int i9 = sharedPreferences.getInt("count", 0);
        if (i9 == 0) {
            return null;
        }
        ArrayList<TLRPC.TL_auth_authorization> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < i9; i10++) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("log_in_token_" + i10, "")));
                TLRPC.auth_Authorization TLdeserialize = TLRPC.auth_Authorization.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize instanceof TLRPC.TL_auth_authorization) {
                    arrayList.add((TLRPC.TL_auth_authorization) TLdeserialize);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return arrayList;
    }

    public static ArrayList<TLRPC.TL_auth_loggedOut> getSavedLogOutTokens() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        int i9 = sharedPreferences.getInt("count", 0);
        if (i9 == 0) {
            return null;
        }
        ArrayList<TLRPC.TL_auth_loggedOut> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < i9; i10++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("log_out_token_" + i10, "")));
            TLRPC.TL_auth_loggedOut TLdeserialize = TLRPC.TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize != null) {
                arrayList.add(TLdeserialize);
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
        for (int i9 = 0; i9 < Math.min(20, arrayList.size()); i9++) {
            arrayList2.add(arrayList.get(i9));
        }
        if (arrayList2.size() > 0) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("count", arrayList2.size());
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_authorization) arrayList2.get(i10)).getObjectSize());
                ((TLRPC.TL_auth_authorization) arrayList2.get(i10)).serializeToStream(serializedData);
                edit.putString("log_in_token_" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
            }
            edit.apply();
            BackupAgent.requestBackup();
        }
    }

    public static void saveLogOutTokens(ArrayList<TLRPC.TL_auth_loggedOut> arrayList) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        ArrayList arrayList2 = new ArrayList();
        sharedPreferences.edit().clear().apply();
        System.currentTimeMillis();
        for (int i9 = 0; i9 < Math.min(20, arrayList.size()); i9++) {
            arrayList2.add(arrayList.get(i9));
        }
        if (arrayList2.size() > 0) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("count", arrayList2.size());
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_loggedOut) arrayList2.get(i10)).getObjectSize());
                ((TLRPC.TL_auth_loggedOut) arrayList2.get(i10)).serializeToStream(serializedData);
                edit.putString("log_out_token_" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
            }
            edit.apply();
        }
    }
}
