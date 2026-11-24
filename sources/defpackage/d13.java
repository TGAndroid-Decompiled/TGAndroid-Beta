package defpackage;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class d13 implements RequestDelegate {
    public final byte a;
    public final f13 b;
    public final u41 c;

    public d13(f13 f13Var, u41 u41Var, byte b) {
        this.a = b;
        this.b = f13Var;
        this.c = u41Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final u41 u41Var = this.c;
        final f13 f13Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        u41 u41Var2 = u41Var;
                        f13 f13Var2 = f13Var;
                        switch (b2) {
                            case 0:
                                u41Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    f13Var2.W1 = groupcallstreamrtmpurl.url;
                                    f13Var2.X1 = groupcallstreamrtmpurl.key;
                                    f13Var2.Y1 = new SpannableStringBuilder(f13Var2.X1);
                                    f13Var2.Z1.O(true);
                                    return;
                                }
                                return;
                            default:
                                u41Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    f13Var2.W1 = groupcallstreamrtmpurl2.url;
                                    f13Var2.X1 = groupcallstreamrtmpurl2.key;
                                    f13Var2.Y1 = new SpannableStringBuilder(f13Var2.X1);
                                    f13Var2.Z1.O(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        u41 u41Var2 = u41Var;
                        f13 f13Var2 = f13Var;
                        switch (b2) {
                            case 0:
                                u41Var2.setLoading(false);
                                if (tLObject2 != null && (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl)) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    f13Var2.W1 = groupcallstreamrtmpurl.url;
                                    f13Var2.X1 = groupcallstreamrtmpurl.key;
                                    f13Var2.Y1 = new SpannableStringBuilder(f13Var2.X1);
                                    f13Var2.Z1.O(true);
                                    return;
                                }
                                return;
                            default:
                                u41Var2.setLoading(false);
                                if (tLObject2 instanceof TL_phone.groupCallStreamRtmpUrl) {
                                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl2 = (TL_phone.groupCallStreamRtmpUrl) tLObject2;
                                    f13Var2.W1 = groupcallstreamrtmpurl2.url;
                                    f13Var2.X1 = groupcallstreamrtmpurl2.key;
                                    f13Var2.Y1 = new SpannableStringBuilder(f13Var2.X1);
                                    f13Var2.Z1.O(true);
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
