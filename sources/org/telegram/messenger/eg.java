package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eg implements RequestDelegate {
    public final int f22194a;
    public final ui f22195b;
    public final SharedPreferences f22196c;

    public eg(ui uiVar, SharedPreferences sharedPreferences, int i7) {
        this.f22194a = i7;
        this.f22195b = uiVar;
        this.f22196c = sharedPreferences;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22194a) {
            case 0:
                g0.h3(new em(this.f22195b, tL_error, tLObject, this.f22196c, 13));
                return;
            case 1:
                final ui uiVar = this.f22195b;
                final SharedPreferences sharedPreferences = this.f22196c;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ui uiVar2 = uiVar;
                                uiVar2.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    uiVar2.M1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("restrictedstatuses", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            default:
                                ui uiVar3 = uiVar;
                                uiVar3.getClass();
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject3.getObjectSize());
                                    tLObject3.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                    uiVar3.L1 = (TLRPC.TL_emojiList) tLObject3;
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
                final ui uiVar2 = this.f22195b;
                uiVar2.getClass();
                final SharedPreferences sharedPreferences2 = this.f22196c;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ui uiVar22 = uiVar2;
                                uiVar22.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    uiVar22.M1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("restrictedstatuses", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            default:
                                ui uiVar3 = uiVar2;
                                uiVar3.getClass();
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject3.getObjectSize());
                                    tLObject3.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    uiVar3.L1 = (TLRPC.TL_emojiList) tLObject3;
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
