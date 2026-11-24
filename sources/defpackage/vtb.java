package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vtb extends d {
    public mu1 E;
    public int F;
    public on G;
    public long a;
    public long b;
    public long c;
    public zgb d;
    public EditTextBoldCursor e;
    public utb f;
    public be0[] h;
    public String n;
    public boolean r;
    public fm2 s;
    public l79 w;
    public TLRPC.TL_forumTopic x;
    public jm4 y;

    public static vtb e0(long j, long j2) {
        Bundle k = ls6.k(j, "chat_id");
        k.putLong("topic_id", j2);
        ?? dVar = new d(k);
        dVar.h = new be0[2];
        dVar.n = "";
        dVar.G = new on(null);
        return dVar;
    }

    @Override
    public final View createView(Context context) {
        be0[] be0VarArr = this.h;
        TLRPC.TL_forumTopic tL_forumTopic = this.x;
        a aVar = this.actionBar;
        if (tL_forumTopic != null) {
            aVar.setTitle(k96.M0(2131751204, null));
        } else {
            aVar.setTitle(k96.M0(2131748059, null));
        }
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setActionBarMenuOnItemClick(new rtb(this));
        TLRPC.TL_forumTopic tL_forumTopic2 = this.x;
        a aVar2 = this.actionBar;
        if (tL_forumTopic2 == null) {
            aVar2.t().e(1, k96.M0(2131751741, null));
        } else {
            aVar2.t().a(2, 2131231245);
        }
        a aVar3 = this.actionBar;
        int i = bkb.Z6;
        zkb.h(i, getResourceProvider(), aVar3);
        this.actionBar.setCastShadows(false);
        cja cjaVar = new cja(context, null);
        this.fragmentView = cjaVar;
        zkb.h(i, getResourceProvider(), cjaVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        cjaVar.addView(linearLayout);
        ld5 ld5Var = new ld5(context);
        TLRPC.TL_forumTopic tL_forumTopic3 = this.x;
        if (tL_forumTopic3 != null && tL_forumTopic3.id == 1) {
            ld5Var.setText(k96.M0(2131751737, null));
        } else {
            ld5Var.setText(k96.M0(2131751689, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(k96.M0(2131751101, null));
        zkb.A(this.e, bkb.Le, getResourceProvider());
        zkb.X(this.e, bkb.Ke, getResourceProvider());
        this.e.setPadding(gl.L(0.0f), this.e.getPaddingTop(), gl.L(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, nme.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new jf6(this, (byte) 18));
        ttb ttbVar = new ttb(context, (byte) 0);
        ttbVar.setOnClickListener(new View.OnClickListener(this) {
            public final vtb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                zgb zgbVar;
                byte b = r2;
                vtb vtbVar = this.b;
                switch (b) {
                    case 0:
                        if (vtbVar.b == 0 && vtbVar.x == null) {
                            jm4 jm4Var = vtbVar.y;
                            int i2 = jm4Var.e + 1;
                            jm4Var.e = i2;
                            int[] iArr = jm4.k;
                            if (i2 > 5) {
                                jm4Var.e = 0;
                                i2 = 0;
                            }
                            int[] iArr2 = jm4Var.h;
                            int i3 = iArr[i2];
                            jm4Var.i = i3;
                            jm4Var.h = (int[]) jm4.l.get(i3);
                            if (bkb.I.o()) {
                                jm4Var.h = new int[]{bm2.f(0.2f, jm4Var.h[0], -1), bm2.f(0.2f, jm4Var.h[1], -1)};
                            }
                            jm4Var.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new pk(jm4Var, iArr2, (byte) 15));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            vtbVar.F = iArr[jm4Var.e];
                            return;
                        }
                        return;
                    default:
                        vtbVar.d.setChecked(!zgbVar.d.h);
                        return;
                }
            }
        });
        for (int i2 = 0; i2 < 2; i2++) {
            be0 be0Var = new be0(context);
            be0VarArr[i2] = be0Var;
            ttbVar.addView(be0Var, nme.e(28, 28, 17));
        }
        frameLayout.addView(ttbVar, nme.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(ld5Var);
        linearLayout2.addView(frameLayout);
        int L = gl.L(16.0f);
        int i3 = bkb.c6;
        Drawable d0 = bkb.d0(L, getThemedColor(i3));
        vkb M = zkb.M(i3);
        wjb resourceProvider = getResourceProvider();
        linearLayout2.setBackground(d0);
        zkb.j(linearLayout2, d0, M, null, resourceProvider);
        linearLayout.addView(linearLayout2, nme.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic4 = this.x;
        if (tL_forumTopic4 != null && tL_forumTopic4.id == 1) {
            ImageView k = tb4.k(context, 2131232149);
            zkb.s(k, bkb.qd, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ttbVar.addView(k, nme.e(22, 22, 17));
            frameLayout2.addView(new View(context), nme.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable d02 = bkb.d0(gl.L(16.0f), getThemedColor(i3));
            vkb M2 = zkb.M(i3);
            wjb resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(d02);
            zkb.j(frameLayout3, d02, M2, null, resourceProvider2);
            zgb zgbVar = new zgb(context);
            this.d = zgbVar;
            zgbVar.getCheckBox().setDrawIconType(0);
            this.d.d(k96.M0(2131751203, null), !this.x.hidden, false, false);
            zgb zgbVar2 = this.d;
            int themedColor = getThemedColor(i3);
            int i4 = bkb.h6;
            zkb.R(zgbVar2, bkb.Z(themedColor, getThemedColor(i4), 16, 16), zkb.M(i3), zkb.M(i4), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final vtb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    zgb zgbVar3;
                    byte b = r2;
                    vtb vtbVar = this.b;
                    switch (b) {
                        case 0:
                            if (vtbVar.b == 0 && vtbVar.x == null) {
                                jm4 jm4Var = vtbVar.y;
                                int i22 = jm4Var.e + 1;
                                jm4Var.e = i22;
                                int[] iArr = jm4.k;
                                if (i22 > 5) {
                                    jm4Var.e = 0;
                                    i22 = 0;
                                }
                                int[] iArr2 = jm4Var.h;
                                int i32 = iArr[i22];
                                jm4Var.i = i32;
                                jm4Var.h = (int[]) jm4.l.get(i32);
                                if (bkb.I.o()) {
                                    jm4Var.h = new int[]{bm2.f(0.2f, jm4Var.h[0], -1), bm2.f(0.2f, jm4Var.h[1], -1)};
                                }
                                jm4Var.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new pk(jm4Var, iArr2, (byte) 15));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                vtbVar.F = iArr[jm4Var.e];
                                return;
                            }
                            return;
                        default:
                            vtbVar.d.setChecked(!zgbVar3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, nme.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, nme.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            mhb mhbVar = new mhb(context);
            mhbVar.setText(k96.M0(2131751202, null));
            frameLayout2.addView(mhbVar, nme.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            utb utbVar = new utb(this, this, getParentActivity());
            this.f = utbVar;
            utbVar.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, nme.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            fm2 e = mm4.e(this.F, "");
            this.y = (jm4) e.a;
            this.w = new l79(context);
            fm2 fm2Var = new fm2(e, this.w, 0, 0);
            fm2Var.x = true;
            this.f.setForumIconDrawable(fm2Var);
            this.s = fm2Var;
            l79 l79Var = this.w;
            be0 be0Var2 = be0VarArr[0];
            ArrayList arrayList = l79Var.n;
            if (!arrayList.contains(be0Var2)) {
                arrayList.add(be0Var2);
            }
            l79 l79Var2 = this.w;
            be0 be0Var3 = be0VarArr[1];
            ArrayList arrayList2 = l79Var2.n;
            if (!arrayList2.contains(be0Var3)) {
                arrayList2.add(be0Var3);
            }
            be0VarArr[0].setImageDrawable(this.s);
            gl.U3(be0VarArr[0], true, 1.0f, true, false);
            gl.U3(be0VarArr[1], false, 1.0f, true, false);
            this.y.d.add(be0VarArr[0]);
            this.y.d.add(be0VarArr[1]);
        }
        linearLayout.addView(frameLayout2, nme.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic5 = this.x;
        if (tL_forumTopic5 != null) {
            this.e.setText(tL_forumTopic5.title);
            f0(Long.valueOf(this.x.icon_emoji_id), true);
        } else {
            f0(0L, true);
        }
        return this.fragmentView;
    }

    public final void f0(Long l, boolean z) {
        long longValue;
        be0[] be0VarArr = this.h;
        if (this.f != null && this.w != null) {
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            this.f.setSelected(Long.valueOf(longValue));
            if (this.b != longValue) {
                if (!z && longValue != 0 && !getUserConfig().p()) {
                    TLRPC.Document e = vl.e(this.currentAccount, l.longValue());
                    if (e != null) {
                        u21.b0(this).r(e, gl.T2(k96.M0(2131743625, null)), k96.M0(2131746842, null), new qtb(this, (byte) 0)).j();
                        return;
                    }
                    return;
                }
                this.b = longValue;
                if (longValue != 0) {
                    vl vlVar = new vl(10, this.currentAccount, longValue);
                    vlVar.setColorFilter(bkb.u3);
                    be0VarArr[1].setAnimatedEmojiDrawable(vlVar);
                    be0VarArr[1].setImageDrawable(null);
                } else {
                    o06 o06Var = new o06(1, null);
                    o06Var.a(this.n);
                    this.w.b(o06Var, false);
                    be0VarArr[1].setImageDrawable(this.s);
                    be0VarArr[1].setAnimatedEmojiDrawable(null);
                }
                be0 be0Var = be0VarArr[0];
                be0 be0Var2 = be0VarArr[1];
                be0VarArr[0] = be0Var2;
                be0VarArr[1] = be0Var;
                gl.U3(be0Var2, true, 0.5f, true, true);
                gl.U3(be0VarArr[1], false, 0.5f, true, true);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.a = -this.arguments.getLong("chat_id");
        long j = this.arguments.getLong("topic_id", 0L);
        this.c = j;
        if (j != 0) {
            TLRPC.TL_forumTopic f = getMessagesController().g4.f(-this.a, this.c);
            this.x = f;
            if (f == null) {
                return false;
            }
            this.F = f.icon_color;
        } else {
            this.F = jm4.k[Math.abs(Utilities.b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        gl.F3(this.e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z && this.r) {
            removeSelfFromStack();
        }
        this.G.e();
        utb utbVar = this.f;
        if (utbVar != null) {
            utbVar.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z) {
            this.G.d();
        }
    }
}
