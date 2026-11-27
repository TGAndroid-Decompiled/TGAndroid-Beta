package defpackage;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hp6 implements RequestDelegate {
    public final byte a;
    public final ls6 b;
    public final SharedPreferences c;

    public hp6(ls6 ls6Var, SharedPreferences sharedPreferences, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = sharedPreferences;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final SharedPreferences sharedPreferences = this.c;
        final ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new g65(this.b, tL_error, tLObject, this.c, (byte) 25));
                return;
            case 1:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        TLObject tLObject2 = tLObject;
                        ls6 ls6Var2 = ls6Var;
                        switch (b2) {
                            case 0:
                                ls6Var2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    ls6Var2.O1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("replyicons", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("replyicons_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    ls6Var2.P1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit2.putString("restrictedstatuses", Utilities.f(serializedData2.toByteArray()));
                                    edit2.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
                                    edit2.apply();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                ls6Var.getClass();
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        TLObject tLObject2 = tLObject;
                        ls6 ls6Var2 = ls6Var;
                        switch (b2) {
                            case 0:
                                ls6Var2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    ls6Var2.O1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("replyicons", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("replyicons_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    ls6Var2.P1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit2.putString("restrictedstatuses", Utilities.f(serializedData2.toByteArray()));
                                    edit2.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
                                    edit2.apply();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
