package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eg implements RequestDelegate {
    public final int f15559a;
    public final vi f15560b;
    public final SharedPreferences f15561c;

    public eg(vi viVar, SharedPreferences sharedPreferences, int i10) {
        this.f15559a = i10;
        this.f15560b = viVar;
        this.f15561c = sharedPreferences;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15559a) {
            case 0:
                i0.g3(new vl(this.f15560b, tL_error, tLObject, this.f15561c, 13));
                return;
            case 1:
                final vi viVar = this.f15560b;
                final SharedPreferences sharedPreferences = this.f15561c;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vi viVar2 = viVar;
                                viVar2.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    viVar2.M1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("restrictedstatuses", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            default:
                                vi viVar3 = viVar;
                                viVar3.getClass();
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject3.getObjectSize());
                                    tLObject3.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                    viVar3.L1 = (TLRPC.TL_emojiList) tLObject3;
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
                final vi viVar2 = this.f15560b;
                viVar2.getClass();
                final SharedPreferences sharedPreferences2 = this.f15561c;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                vi viVar22 = viVar2;
                                viVar22.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    viVar22.M1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("restrictedstatuses", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            default:
                                vi viVar3 = viVar2;
                                viVar3.getClass();
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject3.getObjectSize());
                                    tLObject3.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    viVar3.L1 = (TLRPC.TL_emojiList) tLObject3;
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
