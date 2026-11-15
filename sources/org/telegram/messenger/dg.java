package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dg implements RequestDelegate {
    public final int f23086a;
    public final si f23087b;
    public final SharedPreferences f23088c;

    public dg(si siVar, SharedPreferences sharedPreferences, int i7) {
        this.f23086a = i7;
        this.f23087b = siVar;
        this.f23088c = sharedPreferences;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23086a) {
            case 0:
                g0.h3(new bm(this.f23087b, tL_error, tLObject, this.f23088c, 13));
                return;
            case 1:
                final si siVar = this.f23087b;
                final SharedPreferences sharedPreferences = this.f23088c;
                g0.h3(new Runnable() {
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
                                    siVar2.N1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("restrictedstatuses", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
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
                                    siVar3.M1 = (TLRPC.TL_emojiList) tLObject3;
                                    edit2.putString("replyicons", Utilities.f(serializedData2.toByteArray()));
                                    edit2.putLong("replyicons_last_check", System.currentTimeMillis());
                                    edit2.apply();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final si siVar2 = this.f23087b;
                siVar2.getClass();
                final SharedPreferences sharedPreferences2 = this.f23088c;
                g0.h3(new Runnable() {
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
                                    siVar22.N1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("restrictedstatuses", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
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
                                    siVar3.M1 = (TLRPC.TL_emojiList) tLObject3;
                                    edit2.putString("replyicons", Utilities.f(serializedData2.toByteArray()));
                                    edit2.putLong("replyicons_last_check", System.currentTimeMillis());
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
