package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class w74 {
    public boolean a;
    public StaticLayout b;
    public StaticLayout c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;

    public final void a(rc2 rc2Var) {
        TLRPC.Message message;
        String str;
        int parentWidth;
        String str2;
        SpannableStringBuilder e = y4b.e(new Object[0], 2131750811, false);
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject != null && (message = messageObject.k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User W1 = oc7.r1(rc2Var.a6).W1(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                if (W1 == null) {
                    str = "DELETED";
                } else {
                    str = W1.first_name;
                }
                if (gm.O1()) {
                    parentWidth = gm.P0();
                } else {
                    parentWidth = rc2Var.getParentWidth();
                }
                int i = (int) (parentWidth * 0.4f);
                int ceil = (int) Math.ceil(cmb.W2.measureText(jb6.M0(2131750441, null).concat(" ")));
                if (str == null) {
                    str = "";
                }
                String str3 = (String) TextUtils.ellipsize(str.replace('\n', ' '), cmb.X2, i - ceil, TextUtils.TruncateAt.END);
                String M0 = jb6.M0(2131750437, null);
                int indexOf = M0.indexOf("%1$s");
                String format = String.format(M0, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new z5c(gm.o()), indexOf, str3.length() + indexOf, 33);
                    str2 = spannableStringBuilder;
                } else {
                    str2 = format;
                }
                TextPaint textPaint = cmb.Y2;
                int L = gm.L(10.0f);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.b = new StaticLayout(e, textPaint, L + ((int) (textPaint.measureText(e, 0, e.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.c = new StaticLayout(str2, textPaint, gm.L(10.0f) + ((int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = gm.L(4.0f);
                this.i = gm.L(12.0f);
                this.e = (int) ts2.i(this.h, 2.0f, gm.L(4.0f) + this.c.getHeight() + gm.L(2.0f) + this.b.getHeight() + gm.L(4.0f), this.e);
                this.d = rc2Var.getExtraTextX() + gm.L(20.0f) + gm.L(12.0f) + Math.max(this.b.getWidth(), this.c.getWidth());
                return;
            }
        }
        this.h = gm.L(4.0f);
        this.i = gm.L(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
