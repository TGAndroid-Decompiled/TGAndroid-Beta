package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class h74 {
    public boolean a;
    public StaticLayout b;
    public StaticLayout c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;

    public final void a(wb2 wb2Var) {
        TLRPC.Message message;
        String str;
        int parentWidth;
        String str2;
        SpannableStringBuilder e = t6b.e(new Object[0], 2131750839, false);
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject != null && (message = messageObject.k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User X1 = uc7.s1(wb2Var.a6).X1(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                if (X1 == null) {
                    str = "DELETED";
                } else {
                    str = X1.first_name;
                }
                if (hl.O1()) {
                    parentWidth = hl.P0();
                } else {
                    parentWidth = wb2Var.getParentWidth();
                }
                int i = (int) (parentWidth * 0.4f);
                int ceil = (int) Math.ceil(aob.X2.measureText(ob6.M0(2131750469, null).concat(" ")));
                if (str == null) {
                    str = "";
                }
                String str3 = (String) TextUtils.ellipsize(str.replace('\n', ' '), aob.Y2, i - ceil, TextUtils.TruncateAt.END);
                String M0 = ob6.M0(2131750465, null);
                int indexOf = M0.indexOf("%1$s");
                String format = String.format(M0, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new y7c(hl.o()), indexOf, str3.length() + indexOf, 33);
                    str2 = spannableStringBuilder;
                } else {
                    str2 = format;
                }
                TextPaint textPaint = aob.Z2;
                int L = hl.L(10.0f);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.b = new StaticLayout(e, textPaint, L + ((int) (textPaint.measureText(e, 0, e.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.c = new StaticLayout(str2, textPaint, hl.L(10.0f) + ((int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = hl.L(4.0f);
                this.i = hl.L(12.0f);
                this.e = (int) bs2.i(this.h, 2.0f, hl.L(4.0f) + this.c.getHeight() + hl.L(2.0f) + this.b.getHeight() + hl.L(4.0f), this.e);
                this.d = wb2Var.getExtraTextX() + hl.L(20.0f) + hl.L(12.0f) + Math.max(this.b.getWidth(), this.c.getWidth());
                return;
            }
        }
        this.h = hl.L(4.0f);
        this.i = hl.L(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
