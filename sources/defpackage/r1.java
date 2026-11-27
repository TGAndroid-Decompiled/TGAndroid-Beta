package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.e;
public final class r1 extends ClickableSpan {
    public final byte a;
    public final Object b;
    public final Object c;

    public r1(byte b, String str, e eVar) {
        this.a = b;
        this.c = eVar;
        this.b = str;
    }

    @Override
    public final void onClick(View view) {
        v21 b;
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.c;
                t1Var.d((ClickableSpan) this.b, t1Var.a, 0.0f);
                return;
            case 1:
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (d31.a((ve1) this.c)) {
                        d31.j((ve1) this.c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 2:
                Context context = ((te1) this.c).getContext();
                m01.u(context, "https://fragment.com/username/" + ((String) this.b));
                return;
            case 3:
                dl1 dl1Var = (dl1) this.c;
                if (dl1Var.g1 != null) {
                    dl1Var.d0((CharacterStyle) this.b);
                    return;
                }
                return;
            case 4:
                Context context2 = ((p92) this.c).getContext();
                m01.u(context2, "https://fragment.com/username/" + ((String) this.b));
                return;
            case 5:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (characterStyle instanceof eb2) {
                    ((eb2) characterStyle).onClick(view);
                    return;
                }
                wb2 wb2Var = ((fb2) this.c).a;
                rb2 rb2Var = wb2Var.eb;
                if (rb2Var != null) {
                    rb2Var.L(wb2Var, characterStyle, false);
                    return;
                }
                return;
            case 6:
                ((bv2) this.c).run();
                return;
            case 7:
                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                d31 b0 = d31.b0(((mn8) this.c).d);
                String M0 = ob6.M0(2131748675, null);
                vnb resourceProvider = ((mn8) this.c).d.getResourceProvider();
                b0.getClass();
                if (!hl.C3()) {
                    b = new v21();
                } else {
                    c21 c21Var = new c21(b0.X(), resourceProvider);
                    c21Var.g(2131624341, 36, 36, "Wibe", "Circle");
                    c21Var.b.setText(M0);
                    b = b0.b(c21Var, 1500);
                }
                b.j();
                return;
            case 8:
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (d31.a((xqb) this.c)) {
                        d31.j((xqb) this.c).j();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 9:
                URLSpan uRLSpan = (URLSpan) this.b;
                r3c r3cVar = (r3c) this.c;
                qcc qccVar = r3cVar.N1;
                if (qccVar != null) {
                    if (((Boolean) qccVar.a(uRLSpan)).booleanValue()) {
                        r3cVar.dismiss();
                        return;
                    }
                    return;
                }
                e eVar = r3cVar.M1;
                if (eVar != null) {
                    jj.n0(eVar, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            default:
                hl.g((String) this.b);
                ((Runnable) this.c).run();
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 3:
            case 5:
            case 7:
            default:
                super.updateDrawState(textPaint);
                return;
            case 4:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(aob.v0(aob.xj, (vnb) obj));
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 9:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) obj) instanceof f8c)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(aob.w0(null, aob.k5, false));
                textPaint.setAlpha(min);
                return;
            case 10:
                textPaint.setUnderlineText(false);
                return;
        }
    }

    public r1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public r1(Object obj, Runnable runnable, byte b) {
        this.a = b;
        this.b = obj;
        this.c = runnable;
    }
}
