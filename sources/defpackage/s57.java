package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s57 extends FrameLayout implements jm7, vlb {
    public static final p57 n;
    public static final p57 r;
    public final int a;
    public final bf0 b;
    public final lka c;
    public final TextView d;
    public final pc0 e;
    public final d0b f;
    public TLObject h;

    static {
        int i = cmb.x6;
        n = new p57(2131232240, i);
        r = new p57(2131231944, i);
    }

    public s57(Context context) {
        super(context);
        int i;
        this.a = z8c.t0;
        this.e = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(18.0f));
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        lkaVar.setTextSize(16);
        lkaVar.setEllipsizeByGradient(!jb6.a0);
        lkaVar.setImportantForAccessibility(2);
        anb.W(lkaVar, cmb.D8, null);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        lkaVar.setGravity(i);
        this.f = new d0b(this);
        lkaVar.setDrawablePadding(gm.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        anb.X(textView, cmb.x6, null);
        textView.setGravity(jb6.a0 ? 5 : 3);
        if (jb6.a0) {
            addView(bf0Var, qoe.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(lkaVar, qoe.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, qoe.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(bf0Var, qoe.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(lkaVar, qoe.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, qoe.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, int i, boolean z) {
        p57 p57Var;
        this.h = tLObject;
        tm a = this.f.a(tLObject, cmb.w0(null, cmb.y9, false), false);
        lka lkaVar = this.c;
        lkaVar.i(a);
        if (tLObject != null) {
            pc0 pc0Var = this.e;
            pc0Var.o(tLObject);
            this.b.m(gn5.m(this.a, 1, tLObject), "50_50", pc0Var, tLObject);
            lkaVar.l(bw2.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i <= 0) {
            textView.setVisibility(8);
            lkaVar.setTranslationY(gm.L(9.0f));
            return;
        }
        if (z) {
            p57Var = r;
        } else {
            p57Var = n;
        }
        textView.setText(TextUtils.concat(p57Var.a(getContext(), null), jb6.O(i)));
        textView.setVisibility(0);
        lkaVar.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y9));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.User user;
        if (i == nm7.q5) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.id == user2.id) {
                this.h = user2;
                this.c.i(this.f.a(user2, cmb.w0(null, cmb.y9, false), true));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
        nm7.f(this.a).b(this, nm7.q5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a.b();
        nm7.f(this.a).n(this, nm7.q5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a0 = jb6.a0("AccDescrPersonHasSeen", null, 2131754811, this.c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder k = b10.k(a0, " ");
            k.append((Object) textView.getText());
            a0 = k.toString();
        }
        accessibilityNodeInfo.setText(a0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        boolean z;
        d0b d0bVar = this.f;
        if (d0bVar != null) {
            try {
                tm tmVar = d0bVar.a;
                if (tmVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int w0 = cmb.w0(null, cmb.y9, false);
                    Integer num = tmVar.G;
                    if (num != null && num.intValue() != w0) {
                        tmVar.k(Integer.valueOf(w0));
                        lka lkaVar = this.c;
                        if (lkaVar != null) {
                            lkaVar.invalidate();
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
