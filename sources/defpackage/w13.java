package defpackage;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class w13 implements RequestDelegate {
    public final byte a;
    public final y13 b;
    public final c51 c;

    public w13(y13 y13Var, c51 c51Var, byte b) {
        this.a = b;
        this.b = y13Var;
        this.c = c51Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final c51 c51Var = this.c;
        final y13 y13Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        c51 c51Var2 = c51Var;
                        y13 y13Var2 = y13Var;
                        switch (b2) {
                            case 0:
                                c51Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    y13Var2.W1 = groupcallstreamrtmpurl.url;
                                    y13Var2.X1 = groupcallstreamrtmpurl.key;
                                    y13Var2.Y1 = new SpannableStringBuilder(y13Var2.X1);
                                    y13Var2.Z1.O(true);
                                    return;
                                }
                                return;
                            default:
                                c51Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    y13Var2.W1 = groupcallstreamrtmpurl2.url;
                                    y13Var2.X1 = groupcallstreamrtmpurl2.key;
                                    y13Var2.Y1 = new SpannableStringBuilder(y13Var2.X1);
                                    y13Var2.Z1.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        c51 c51Var2 = c51Var;
                        y13 y13Var2 = y13Var;
                        switch (b2) {
                            case 0:
                                c51Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    y13Var2.W1 = groupcallstreamrtmpurl.url;
                                    y13Var2.X1 = groupcallstreamrtmpurl.key;
                                    y13Var2.Y1 = new SpannableStringBuilder(y13Var2.X1);
                                    y13Var2.Z1.O(true);
                                    return;
                                }
                                return;
                            default:
                                c51Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    y13Var2.W1 = groupcallstreamrtmpurl2.url;
                                    y13Var2.X1 = groupcallstreamrtmpurl2.key;
                                    y13Var2.Y1 = new SpannableStringBuilder(y13Var2.X1);
                                    y13Var2.Z1.O(true);
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
