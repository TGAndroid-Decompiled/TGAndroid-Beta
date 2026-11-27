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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wxb extends e {
    public zu1 E;
    public int F;
    public pn G;
    public long a;
    public long b;
    public long c;
    public vkb d;
    public EditTextBoldCursor e;
    public vxb f;
    public de0[] h;
    public String n;
    public boolean r;
    public zm2 s;
    public ya9 w;
    public TLRPC.TL_forumTopic x;
    public oo4 y;

    public static wxb e0(long j, long j2) {
        Bundle k = qu6.k(j, "chat_id");
        k.putLong("topic_id", j2);
        ?? eVar = new e(k);
        eVar.h = new de0[2];
        eVar.n = "";
        eVar.G = new pn(null);
        return eVar;
    }

    @Override
    public final View createView(Context context) {
        de0[] de0VarArr = this.h;
        TLRPC.TL_forumTopic tL_forumTopic = this.x;
        a aVar = this.actionBar;
        if (tL_forumTopic != null) {
            aVar.setTitle(ob6.M0(2131751181, null));
        } else {
            aVar.setTitle(ob6.M0(2131748005, null));
        }
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setActionBarMenuOnItemClick(new sxb(this));
        TLRPC.TL_forumTopic tL_forumTopic2 = this.x;
        a aVar2 = this.actionBar;
        if (tL_forumTopic2 == null) {
            aVar2.u().e(1, ob6.M0(2131751718, null));
        } else {
            aVar2.u().a(2, 2131231245);
        }
        a aVar3 = this.actionBar;
        int i = aob.a7;
        yob.h(i, getResourceProvider(), aVar3);
        this.actionBar.setCastShadows(false);
        wma wmaVar = new wma(context, null);
        this.fragmentView = wmaVar;
        yob.h(i, getResourceProvider(), wmaVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        wmaVar.addView(linearLayout);
        mf5 mf5Var = new mf5(context);
        TLRPC.TL_forumTopic tL_forumTopic3 = this.x;
        if (tL_forumTopic3 != null && tL_forumTopic3.id == 1) {
            mf5Var.setText(ob6.M0(2131751714, null));
        } else {
            mf5Var.setText(ob6.M0(2131751666, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(ob6.M0(2131751078, null));
        yob.A(this.e, aob.Me, getResourceProvider());
        yob.X(this.e, aob.Le, getResourceProvider());
        this.e.setPadding(hl.L(0.0f), this.e.getPaddingTop(), hl.L(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, tre.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new nh6(this, (byte) 19));
        uxb uxbVar = new uxb(context, (byte) 0);
        uxbVar.setOnClickListener(new View.OnClickListener(this) {
            public final wxb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                vkb vkbVar;
                byte b = r2;
                wxb wxbVar = this.b;
                switch (b) {
                    case 0:
                        if (wxbVar.b == 0 && wxbVar.x == null) {
                            oo4 oo4Var = wxbVar.y;
                            int i2 = oo4Var.e + 1;
                            oo4Var.e = i2;
                            int[] iArr = oo4.k;
                            if (i2 > 5) {
                                oo4Var.e = 0;
                                i2 = 0;
                            }
                            int[] iArr2 = oo4Var.h;
                            int i3 = iArr[i2];
                            oo4Var.i = i3;
                            oo4Var.h = (int[]) oo4.l.get(i3);
                            if (aob.I.o()) {
                                oo4Var.h = new int[]{vm2.f(0.2f, oo4Var.h[0], -1), vm2.f(0.2f, oo4Var.h[1], -1)};
                            }
                            oo4Var.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new lk(oo4Var, iArr2, (byte) 15));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            wxbVar.F = iArr[oo4Var.e];
                            return;
                        }
                        return;
                    default:
                        wxbVar.d.setChecked(!vkbVar.d.h);
                        return;
                }
            }
        });
        for (int i2 = 0; i2 < 2; i2++) {
            de0 de0Var = new de0(context);
            de0VarArr[i2] = de0Var;
            uxbVar.addView(de0Var, tre.e(28, 28, 17));
        }
        frameLayout.addView(uxbVar, tre.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(mf5Var);
        linearLayout2.addView(frameLayout);
        int L = hl.L(16.0f);
        int i3 = aob.d6;
        Drawable d0 = aob.d0(L, getThemedColor(i3));
        uob M = yob.M(i3);
        vnb resourceProvider = getResourceProvider();
        linearLayout2.setBackground(d0);
        yob.j(linearLayout2, d0, M, null, resourceProvider);
        linearLayout.addView(linearLayout2, tre.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic4 = this.x;
        if (tL_forumTopic4 != null && tL_forumTopic4.id == 1) {
            ImageView k = qd4.k(context, 2131232149);
            yob.s(k, aob.rd, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            uxbVar.addView(k, tre.e(22, 22, 17));
            frameLayout2.addView(new View(context), tre.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable d02 = aob.d0(hl.L(16.0f), getThemedColor(i3));
            uob M2 = yob.M(i3);
            vnb resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(d02);
            yob.j(frameLayout3, d02, M2, null, resourceProvider2);
            vkb vkbVar = new vkb(context);
            this.d = vkbVar;
            vkbVar.getCheckBox().setDrawIconType(0);
            this.d.d(ob6.M0(2131751180, null), !this.x.hidden, false, false);
            vkb vkbVar2 = this.d;
            int themedColor = getThemedColor(i3);
            int i4 = aob.i6;
            yob.R(vkbVar2, aob.Z(themedColor, getThemedColor(i4), 16, 16), yob.M(i3), yob.M(i4), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final wxb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    vkb vkbVar3;
                    byte b = r2;
                    wxb wxbVar = this.b;
                    switch (b) {
                        case 0:
                            if (wxbVar.b == 0 && wxbVar.x == null) {
                                oo4 oo4Var = wxbVar.y;
                                int i22 = oo4Var.e + 1;
                                oo4Var.e = i22;
                                int[] iArr = oo4.k;
                                if (i22 > 5) {
                                    oo4Var.e = 0;
                                    i22 = 0;
                                }
                                int[] iArr2 = oo4Var.h;
                                int i32 = iArr[i22];
                                oo4Var.i = i32;
                                oo4Var.h = (int[]) oo4.l.get(i32);
                                if (aob.I.o()) {
                                    oo4Var.h = new int[]{vm2.f(0.2f, oo4Var.h[0], -1), vm2.f(0.2f, oo4Var.h[1], -1)};
                                }
                                oo4Var.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new lk(oo4Var, iArr2, (byte) 15));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                wxbVar.F = iArr[oo4Var.e];
                                return;
                            }
                            return;
                        default:
                            wxbVar.d.setChecked(!vkbVar3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, tre.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, tre.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            ilb ilbVar = new ilb(context);
            ilbVar.setText(ob6.M0(2131751179, null));
            frameLayout2.addView(ilbVar, tre.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            vxb vxbVar = new vxb(this, this, getParentActivity());
            this.f = vxbVar;
            vxbVar.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, tre.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            zm2 e = ro4.e(this.F, "");
            this.y = (oo4) e.a;
            this.w = new ya9(context);
            zm2 zm2Var = new zm2(e, this.w, 0, 0);
            zm2Var.x = true;
            this.f.setForumIconDrawable(zm2Var);
            this.s = zm2Var;
            ya9 ya9Var = this.w;
            de0 de0Var2 = de0VarArr[0];
            ArrayList arrayList = ya9Var.n;
            if (!arrayList.contains(de0Var2)) {
                arrayList.add(de0Var2);
            }
            ya9 ya9Var2 = this.w;
            de0 de0Var3 = de0VarArr[1];
            ArrayList arrayList2 = ya9Var2.n;
            if (!arrayList2.contains(de0Var3)) {
                arrayList2.add(de0Var3);
            }
            de0VarArr[0].setImageDrawable(this.s);
            hl.T3(de0VarArr[0], true, 1.0f, true, false);
            hl.T3(de0VarArr[1], false, 1.0f, true, false);
            this.y.d.add(de0VarArr[0]);
            this.y.d.add(de0VarArr[1]);
        }
        linearLayout.addView(frameLayout2, tre.c(-1.0f, -1));
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
        de0[] de0VarArr = this.h;
        if (this.f != null && this.w != null) {
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            this.f.setSelected(Long.valueOf(longValue));
            if (this.b != longValue) {
                if (!z && longValue != 0 && !getUserConfig().p()) {
                    TLRPC.Document e = wl.e(this.currentAccount, l.longValue());
                    if (e != null) {
                        d31.b0(this).r(e, hl.S2(ob6.M0(2131743519, null)), ob6.M0(2131746762, null), new rxb(this, (byte) 0)).j();
                        return;
                    }
                    return;
                }
                this.b = longValue;
                if (longValue != 0) {
                    wl wlVar = new wl(10, this.currentAccount, longValue);
                    wlVar.setColorFilter(aob.v3);
                    de0VarArr[1].setAnimatedEmojiDrawable(wlVar);
                    de0VarArr[1].setImageDrawable(null);
                } else {
                    s26 s26Var = new s26(1, null);
                    s26Var.a(this.n);
                    this.w.b(s26Var, false);
                    de0VarArr[1].setImageDrawable(this.s);
                    de0VarArr[1].setAnimatedEmojiDrawable(null);
                }
                de0 de0Var = de0VarArr[0];
                de0 de0Var2 = de0VarArr[1];
                de0VarArr[0] = de0Var2;
                de0VarArr[1] = de0Var;
                hl.T3(de0Var2, true, 0.5f, true, true);
                hl.T3(de0VarArr[1], false, 0.5f, true, true);
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
            this.F = oo4.k[Math.abs(Utilities.b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        hl.E3(this.e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z && this.r) {
            removeSelfFromStack();
        }
        this.G.e();
        vxb vxbVar = this.f;
        if (vxbVar != null) {
            vxbVar.setAnimationsEnabled(this.fragmentBeginToShow);
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
