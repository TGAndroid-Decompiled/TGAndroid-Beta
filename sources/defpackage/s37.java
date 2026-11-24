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
public final class s37 extends FrameLayout implements gk7, tjb {
    public static final p37 n;
    public static final p37 r;
    public final int a;
    public final be0 b;
    public final jia c;
    public final TextView d;
    public final pb0 e;
    public final aya f;
    public TLObject h;

    static {
        int i = bkb.x6;
        n = new p37(2131232239, i);
        r = new p37(2131231943, i);
    }

    public s37(Context context) {
        super(context);
        int i;
        this.a = y6c.t0;
        this.e = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(18.0f));
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        jiaVar.setTextSize(16);
        jiaVar.setEllipsizeByGradient(!k96.a0);
        jiaVar.setImportantForAccessibility(2);
        zkb.W(jiaVar, bkb.D8, null);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        jiaVar.setGravity(i);
        this.f = new aya(this);
        jiaVar.setDrawablePadding(gl.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        zkb.X(textView, bkb.x6, null);
        textView.setGravity(k96.a0 ? 5 : 3);
        if (k96.a0) {
            addView(be0Var, nme.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(jiaVar, nme.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, nme.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(be0Var, nme.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(jiaVar, nme.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, nme.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, int i, boolean z) {
        p37 p37Var;
        this.h = tLObject;
        tl a = this.f.a(tLObject, bkb.w0(null, bkb.y9, false), false);
        jia jiaVar = this.c;
        jiaVar.i(a);
        if (tLObject != null) {
            pb0 pb0Var = this.e;
            pb0Var.o(tLObject);
            this.b.m(gl5.m(this.a, 1, tLObject), "50_50", pb0Var, tLObject);
            jiaVar.l(qu2.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i <= 0) {
            textView.setVisibility(8);
            jiaVar.setTranslationY(gl.L(9.0f));
            return;
        }
        if (z) {
            p37Var = r;
        } else {
            p37Var = n;
        }
        textView.setText(TextUtils.concat(p37Var.a(getContext(), null), k96.O(i)));
        textView.setVisibility(0);
        jiaVar.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y9));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.User user;
        if (i == kk7.o5) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.id == user2.id) {
                this.h = user2;
                this.c.i(this.f.a(user2, bkb.w0(null, bkb.y9, false), true));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
        kk7.f(this.a).b(this, kk7.o5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a.b();
        kk7.f(this.a).n(this, kk7.o5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a0 = k96.a0("AccDescrPersonHasSeen", null, 2131754811, this.c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder k = b00.k(a0, " ");
            k.append((Object) textView.getText());
            a0 = k.toString();
        }
        accessibilityNodeInfo.setText(a0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        boolean z;
        aya ayaVar = this.f;
        if (ayaVar != null) {
            try {
                tl tlVar = ayaVar.a;
                if (tlVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int w0 = bkb.w0(null, bkb.y9, false);
                    Integer num = tlVar.G;
                    if (num != null && num.intValue() != w0) {
                        tlVar.k(Integer.valueOf(w0));
                        jia jiaVar = this.c;
                        if (jiaVar != null) {
                            jiaVar.invalidate();
                        }
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
