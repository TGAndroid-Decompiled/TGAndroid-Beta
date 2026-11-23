package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nf implements RequestDelegate {
    public final int f25758a;
    public final si f25759b;
    public final SharedPreferences f25760c;

    public nf(si siVar, SharedPreferences sharedPreferences, int i7) {
        this.f25758a = i7;
        this.f25759b = siVar;
        this.f25760c = sharedPreferences;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25758a) {
            case 0:
                final si siVar = this.f25759b;
                siVar.getClass();
                final SharedPreferences sharedPreferences = this.f25760c;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                si siVar2 = siVar;
                                siVar2.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    siVar2.O1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("replyicons", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("replyicons_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            default:
                                si siVar3 = siVar;
                                siVar3.getClass();
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject3.getObjectSize());
                                    tLObject3.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                    siVar3.P1 = (TLRPC.TL_emojiList) tLObject3;
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
                g0.g3(new ul(this.f25759b, tL_error, tLObject, this.f25760c, 13));
                return;
            default:
                final si siVar2 = this.f25759b;
                final SharedPreferences sharedPreferences2 = this.f25760c;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                si siVar22 = siVar2;
                                siVar22.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    siVar22.O1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("replyicons", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("replyicons_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            default:
                                si siVar3 = siVar2;
                                siVar3.getClass();
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject3.getObjectSize());
                                    tLObject3.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    siVar3.P1 = (TLRPC.TL_emojiList) tLObject3;
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
