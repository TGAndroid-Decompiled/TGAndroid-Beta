package org.telegram.messenger;

import android.content.SharedPreferences;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.telegram.messenger.NotificationBadge;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC$TL_auth_authorization;
import org.telegram.tgnet.TLRPC$TL_auth_loggedOut;
import org.telegram.tgnet.TLRPC$auth_Authorization;
public class AuthTokensHelper {
    public static ArrayList<TLRPC$TL_auth_loggedOut> getSavedLogOutTokens() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        int i = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        if (i == 0) {
            return null;
        }
        ArrayList<TLRPC$TL_auth_loggedOut> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("log_out_token_" + i2, "")));
            TLRPC$TL_auth_loggedOut TLdeserialize = TLRPC$TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize != null) {
                arrayList.add(TLdeserialize);
            }
        }
        return arrayList;
    }

    public static void saveLogOutTokens(ArrayList<TLRPC$TL_auth_loggedOut> arrayList) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        ArrayList arrayList2 = new ArrayList();
        sharedPreferences.edit().clear().apply();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        for (int i = 0; i < Math.min(20, arrayList.size()); i++) {
            arrayList2.add(arrayList.get(i));
        }
        if (arrayList2.size() > 0) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList2.size());
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                SerializedData serializedData = new SerializedData(((TLRPC$TL_auth_loggedOut) arrayList2.get(i2)).getObjectSize());
                ((TLRPC$TL_auth_loggedOut) arrayList2.get(i2)).serializeToStream(serializedData);
                edit.putString("log_out_token_" + i2, Utilities.bytesToHex(serializedData.toByteArray()));
            }
            edit.apply();
        }
    }

    public static ArrayList<TLRPC$TL_auth_authorization> getSavedLogInTokens() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens_login", 0);
        int i = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        if (i == 0) {
            return null;
        }
        ArrayList<TLRPC$TL_auth_authorization> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("log_in_token_" + i2, "")));
            TLRPC$auth_Authorization TLdeserialize = TLRPC$auth_Authorization.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize instanceof TLRPC$TL_auth_authorization) {
                arrayList.add((TLRPC$TL_auth_authorization) TLdeserialize);
            }
        }
        return arrayList;
    }

    public static void saveLogInToken(TLRPC$TL_auth_authorization tLRPC$TL_auth_authorization) {
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("saveLogInToken " + new String(tLRPC$TL_auth_authorization.future_auth_token, StandardCharsets.UTF_8));
        }
        ArrayList<TLRPC$TL_auth_authorization> savedLogInTokens = getSavedLogInTokens();
        if (savedLogInTokens == null) {
            savedLogInTokens = new ArrayList<>();
        }
        savedLogInTokens.add(0, tLRPC$TL_auth_authorization);
        saveLogInTokens(savedLogInTokens);
    }

    private static void saveLogInTokens(ArrayList<TLRPC$TL_auth_authorization> arrayList) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens_login", 0);
        ArrayList arrayList2 = new ArrayList();
        sharedPreferences.edit().clear().apply();
        for (int i = 0; i < Math.min(20, arrayList.size()); i++) {
            arrayList2.add(arrayList.get(i));
        }
        if (arrayList2.size() > 0) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList2.size());
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                SerializedData serializedData = new SerializedData(((TLRPC$TL_auth_authorization) arrayList2.get(i2)).getObjectSize());
                ((TLRPC$TL_auth_authorization) arrayList2.get(i2)).serializeToStream(serializedData);
                edit.putString("log_in_token_" + i2, Utilities.bytesToHex(serializedData.toByteArray()));
            }
            edit.apply();
            BackupAgent.requestBackup(ApplicationLoader.applicationContext);
        }
    }

    public static void addLogOutToken(TLRPC$TL_auth_loggedOut tLRPC$TL_auth_loggedOut) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        int i = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        SerializedData serializedData = new SerializedData(tLRPC$TL_auth_loggedOut.getObjectSize());
        tLRPC$TL_auth_loggedOut.serializeToStream(serializedData);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("log_out_token_" + i, Utilities.bytesToHex(serializedData.toByteArray())).putInt(NotificationBadge.NewHtcHomeBadger.COUNT, i + 1).apply();
        BackupAgent.requestBackup(ApplicationLoader.applicationContext);
    }
}
