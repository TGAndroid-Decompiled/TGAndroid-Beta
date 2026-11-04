package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wf implements RequestDelegate {
    public final int f26195a;
    public final li f26196b;
    public final SharedPreferences f26197c;

    public wf(li liVar, SharedPreferences sharedPreferences, int i3) {
        this.f26195a = i3;
        this.f26196b = liVar;
        this.f26197c = sharedPreferences;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26195a) {
            case 0:
                g0.h3(new ul(this.f26196b, tL_error, tLObject, this.f26197c, 13));
                return;
            case 1:
                final li liVar = this.f26196b;
                final SharedPreferences sharedPreferences = this.f26197c;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                li liVar2 = liVar;
                                liVar2.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    liVar2.N1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("restrictedstatuses", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            default:
                                li liVar3 = liVar;
                                liVar3.getClass();
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject3.getObjectSize());
                                    tLObject3.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                    liVar3.M1 = (TLRPC.TL_emojiList) tLObject3;
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
                final li liVar2 = this.f26196b;
                liVar2.getClass();
                final SharedPreferences sharedPreferences2 = this.f26197c;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                li liVar22 = liVar2;
                                liVar22.getClass();
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                                    tLObject2.serializeToStream(serializedData);
                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    liVar22.N1 = (TLRPC.TL_emojiList) tLObject2;
                                    edit.putString("restrictedstatuses", Utilities.f(serializedData.toByteArray()));
                                    edit.putLong("restrictedstatuses_last_check", System.currentTimeMillis());
                                    edit.apply();
                                    return;
                                }
                                return;
                            default:
                                li liVar3 = liVar2;
                                liVar3.getClass();
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_emojiList) {
                                    SerializedData serializedData2 = new SerializedData(tLObject3.getObjectSize());
                                    tLObject3.serializeToStream(serializedData2);
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    liVar3.M1 = (TLRPC.TL_emojiList) tLObject3;
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
