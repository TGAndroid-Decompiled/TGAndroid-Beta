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
import org.telegram.ui.ActionBar.d;
public final class q1 extends ClickableSpan {
    public final byte a;
    public final Object b;
    public final Object c;

    public q1(byte b, String str, d dVar) {
        this.a = b;
        this.c = dVar;
        this.b = str;
    }

    @Override
    public final void onClick(View view) {
        u31 b;
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.c;
                s1Var.d((ClickableSpan) this.b, s1Var.a, 0.0f);
                return;
            case 1:
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (c41.a((uf1) this.c)) {
                        c41.j((uf1) this.c).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 2:
                Context context = ((sf1) this.c).getContext();
                l11.u(context, "https://fragment.com/username/" + ((String) this.b));
                return;
            case 3:
                cm1 cm1Var = (cm1) this.c;
                if (cm1Var.g1 != null) {
                    cm1Var.d0((CharacterStyle) this.b);
                    return;
                }
                return;
            case 4:
                Context context2 = ((ka2) this.c).getContext();
                l11.u(context2, "https://fragment.com/username/" + ((String) this.b));
                return;
            case 5:
                CharacterStyle characterStyle = (CharacterStyle) this.b;
                if (characterStyle instanceof zb2) {
                    ((zb2) characterStyle).onClick(view);
                    return;
                }
                rc2 rc2Var = ((ac2) this.c).a;
                mc2 mc2Var = rc2Var.eb;
                if (mc2Var != null) {
                    mc2Var.M(rc2Var, characterStyle, false);
                    return;
                }
                return;
            case 6:
                ((mv2) this.c).run();
                return;
            case 7:
                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                c41 b0 = c41.b0(((bm8) this.c).d);
                String M0 = jb6.M0(2131748678, null);
                ylb resourceProvider = ((bm8) this.c).d.getResourceProvider();
                b0.getClass();
                if (!gm.C3()) {
                    b = new u31();
                } else {
                    b31 b31Var = new b31(b0.X(), resourceProvider);
                    b31Var.c(2131624341, 36, 36, "Wibe", "Circle");
                    b31Var.b.setText(M0);
                    b = b0.b(b31Var, 1500);
                }
                b.j();
                return;
            case 8:
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                    if (c41.a((zob) this.c)) {
                        c41.j((zob) this.c).j();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 9:
                URLSpan uRLSpan = (URLSpan) this.b;
                s1c s1cVar = (s1c) this.c;
                rac racVar = s1cVar.N1;
                if (racVar != null) {
                    if (((Boolean) racVar.a(uRLSpan)).booleanValue()) {
                        s1cVar.dismiss();
                        return;
                    }
                    return;
                }
                d dVar = s1cVar.M1;
                if (dVar != null) {
                    ik.n0(dVar, uRLSpan.getURL(), false, false);
                    return;
                }
                return;
            default:
                gm.g((String) this.b);
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
                textPaint.setColor(cmb.v0(cmb.wj, (ylb) obj));
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 9:
                int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
                if (!(((URLSpan) obj) instanceof g6c)) {
                    textPaint.setUnderlineText(true);
                }
                textPaint.setColor(cmb.w0(null, cmb.j5, false));
                textPaint.setAlpha(min);
                return;
            case 10:
                textPaint.setUnderlineText(false);
                return;
        }
    }

    public q1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public q1(Object obj, Runnable runnable, byte b) {
        this.a = b;
        this.b = obj;
        this.c = runnable;
    }
}
