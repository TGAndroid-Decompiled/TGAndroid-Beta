package defpackage;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class p23 implements RequestDelegate {
    public final byte a;
    public final r23 b;
    public final b61 c;

    public p23(r23 r23Var, b61 b61Var, byte b) {
        this.a = b;
        this.b = r23Var;
        this.c = b61Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final b61 b61Var = this.c;
        final r23 r23Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        b61 b61Var2 = b61Var;
                        r23 r23Var2 = r23Var;
                        switch (b2) {
                            case 0:
                                b61Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    r23Var2.W1 = groupcallstreamrtmpurl.url;
                                    r23Var2.X1 = groupcallstreamrtmpurl.key;
                                    r23Var2.Y1 = new SpannableStringBuilder(r23Var2.X1);
                                    r23Var2.Z1.O(true);
                                    return;
                                }
                                return;
                            default:
                                b61Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    r23Var2.W1 = groupcallstreamrtmpurl2.url;
                                    r23Var2.X1 = groupcallstreamrtmpurl2.key;
                                    r23Var2.Y1 = new SpannableStringBuilder(r23Var2.X1);
                                    r23Var2.Z1.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        b61 b61Var2 = b61Var;
                        r23 r23Var2 = r23Var;
                        switch (b2) {
                            case 0:
                                b61Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    r23Var2.W1 = groupcallstreamrtmpurl.url;
                                    r23Var2.X1 = groupcallstreamrtmpurl.key;
                                    r23Var2.Y1 = new SpannableStringBuilder(r23Var2.X1);
                                    r23Var2.Z1.O(true);
                                    return;
                                }
                                return;
                            default:
                                b61Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    r23Var2.W1 = groupcallstreamrtmpurl2.url;
                                    r23Var2.X1 = groupcallstreamrtmpurl2.key;
                                    r23Var2.Y1 = new SpannableStringBuilder(r23Var2.X1);
                                    r23Var2.Z1.O(true);
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
