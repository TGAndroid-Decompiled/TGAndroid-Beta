package defpackage;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bn6 implements RequestDelegate {
    public final byte a;
    public final hq6 b;
    public final SharedPreferences c;

    public bn6(hq6 hq6Var, SharedPreferences sharedPreferences, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = sharedPreferences;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final SharedPreferences sharedPreferences = this.c;
        final hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                hq6Var.getClass();
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        TLObject tLObject2 = tLObject;
                        hq6 hq6Var2 = hq6Var;
                        switch (b2) {
                            case 0:
                                hq6Var2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    hq6Var2.O1 = (TLRPC.TL_emojiList) tLObject2;
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
                                    hq6Var2.P1 = (TLRPC.TL_emojiList) tLObject2;
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
            case 1:
                gl.d3(new e45(this.b, tL_error, tLObject, this.c, (byte) 25));
                return;
            default:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        TLObject tLObject2 = tLObject;
                        hq6 hq6Var2 = hq6Var;
                        switch (b2) {
                            case 0:
                                hq6Var2.getClass();
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    hq6Var2.O1 = (TLRPC.TL_emojiList) tLObject2;
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
                                    hq6Var2.P1 = (TLRPC.TL_emojiList) tLObject2;
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
