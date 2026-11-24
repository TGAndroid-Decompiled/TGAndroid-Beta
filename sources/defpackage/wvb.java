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
public final class wvb extends d {
    public yv1 E;
    public int F;
    public po G;
    public long a;
    public long b;
    public long c;
    public ajb d;
    public EditTextBoldCursor e;
    public vvb f;
    public bf0[] h;
    public String n;
    public boolean r;
    public sn2 s;
    public n99 w;
    public TLRPC.TL_forumTopic x;
    public ko4 y;

    public static wvb f0(long j, long j2) {
        Bundle k = kt6.k(j, "chat_id");
        k.putLong("topic_id", j2);
        ?? dVar = new d(k);
        dVar.h = new bf0[2];
        dVar.n = "";
        dVar.G = new po(null);
        return dVar;
    }

    @Override
    public final View createView(Context context) {
        bf0[] bf0VarArr = this.h;
        TLRPC.TL_forumTopic tL_forumTopic = this.x;
        a aVar = this.actionBar;
        if (tL_forumTopic != null) {
            aVar.setTitle(jb6.M0(2131751153, null));
        } else {
            aVar.setTitle(jb6.M0(2131748008, null));
        }
        this.actionBar.setBackButtonImage(2131231244);
        this.actionBar.setActionBarMenuOnItemClick(new svb(this));
        TLRPC.TL_forumTopic tL_forumTopic2 = this.x;
        a aVar2 = this.actionBar;
        if (tL_forumTopic2 == null) {
            aVar2.t().e(1, jb6.M0(2131751690, null));
        } else {
            aVar2.t().a(2, 2131231246);
        }
        a aVar3 = this.actionBar;
        int i = cmb.Z6;
        anb.h(i, getResourceProvider(), aVar3);
        this.actionBar.setCastShadows(false);
        ela elaVar = new ela(context, null);
        this.fragmentView = elaVar;
        anb.h(i, getResourceProvider(), elaVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        elaVar.addView(linearLayout);
        jf5 jf5Var = new jf5(context);
        TLRPC.TL_forumTopic tL_forumTopic3 = this.x;
        if (tL_forumTopic3 != null && tL_forumTopic3.id == 1) {
            jf5Var.setText(jb6.M0(2131751686, null));
        } else {
            jf5Var.setText(jb6.M0(2131751638, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(jb6.M0(2131751050, null));
        anb.A(this.e, cmb.Le, getResourceProvider());
        anb.X(this.e, cmb.Ke, getResourceProvider());
        this.e.setPadding(gm.L(0.0f), this.e.getPaddingTop(), gm.L(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, qoe.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new og6(this, (byte) 19));
        uvb uvbVar = new uvb(context, (byte) 0);
        uvbVar.setOnClickListener(new View.OnClickListener(this) {
            public final wvb b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                ajb ajbVar;
                byte b = r2;
                wvb wvbVar = this.b;
                switch (b) {
                    case 0:
                        if (wvbVar.b == 0 && wvbVar.x == null) {
                            ko4 ko4Var = wvbVar.y;
                            int i2 = ko4Var.e + 1;
                            ko4Var.e = i2;
                            int[] iArr = ko4.k;
                            if (i2 > 5) {
                                ko4Var.e = 0;
                                i2 = 0;
                            }
                            int[] iArr2 = ko4Var.h;
                            int i3 = iArr[i2];
                            ko4Var.i = i3;
                            ko4Var.h = (int[]) ko4.l.get(i3);
                            if (cmb.I.o()) {
                                ko4Var.h = new int[]{on2.f(0.2f, ko4Var.h[0], -1), on2.f(0.2f, ko4Var.h[1], -1)};
                            }
                            ko4Var.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new pl(ko4Var, iArr2, (byte) 15));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            wvbVar.F = iArr[ko4Var.e];
                            return;
                        }
                        return;
                    default:
                        wvbVar.d.setChecked(!ajbVar.d.h);
                        return;
                }
            }
        });
        for (int i2 = 0; i2 < 2; i2++) {
            bf0 bf0Var = new bf0(context);
            bf0VarArr[i2] = bf0Var;
            uvbVar.addView(bf0Var, qoe.e(28, 28, 17));
        }
        frameLayout.addView(uvbVar, qoe.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(jf5Var);
        linearLayout2.addView(frameLayout);
        int L = gm.L(16.0f);
        int i3 = cmb.c6;
        Drawable d0 = cmb.d0(L, getThemedColor(i3));
        wmb M = anb.M(i3);
        ylb resourceProvider = getResourceProvider();
        linearLayout2.setBackground(d0);
        anb.j(linearLayout2, d0, M, null, resourceProvider);
        linearLayout.addView(linearLayout2, qoe.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic4 = this.x;
        if (tL_forumTopic4 != null && tL_forumTopic4.id == 1) {
            ImageView k = td4.k(context, 2131232150);
            anb.s(k, cmb.qd, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            uvbVar.addView(k, qoe.e(22, 22, 17));
            frameLayout2.addView(new View(context), qoe.c(8.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context);
            InsetDrawable d02 = cmb.d0(gm.L(16.0f), getThemedColor(i3));
            wmb M2 = anb.M(i3);
            ylb resourceProvider2 = getResourceProvider();
            frameLayout3.setBackground(d02);
            anb.j(frameLayout3, d02, M2, null, resourceProvider2);
            ajb ajbVar = new ajb(context);
            this.d = ajbVar;
            ajbVar.getCheckBox().setDrawIconType(0);
            this.d.d(jb6.M0(2131751152, null), !this.x.hidden, false, false);
            ajb ajbVar2 = this.d;
            int themedColor = getThemedColor(i3);
            int i4 = cmb.h6;
            anb.R(ajbVar2, cmb.Z(themedColor, getThemedColor(i4), 16, 16), anb.M(i3), anb.M(i4), getResourceProvider());
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final wvb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    ajb ajbVar3;
                    byte b = r2;
                    wvb wvbVar = this.b;
                    switch (b) {
                        case 0:
                            if (wvbVar.b == 0 && wvbVar.x == null) {
                                ko4 ko4Var = wvbVar.y;
                                int i22 = ko4Var.e + 1;
                                ko4Var.e = i22;
                                int[] iArr = ko4.k;
                                if (i22 > 5) {
                                    ko4Var.e = 0;
                                    i22 = 0;
                                }
                                int[] iArr2 = ko4Var.h;
                                int i32 = iArr[i22];
                                ko4Var.i = i32;
                                ko4Var.h = (int[]) ko4.l.get(i32);
                                if (cmb.I.o()) {
                                    ko4Var.h = new int[]{on2.f(0.2f, ko4Var.h[0], -1), on2.f(0.2f, ko4Var.h[1], -1)};
                                }
                                ko4Var.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new pl(ko4Var, iArr2, (byte) 15));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                wvbVar.F = iArr[ko4Var.e];
                                return;
                            }
                            return;
                        default:
                            wvbVar.d.setChecked(!ajbVar3.d.h);
                            return;
                    }
                }
            });
            frameLayout3.addView(this.d, qoe.e(-1, 50, 119));
            frameLayout2.addView(frameLayout3, qoe.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            njb njbVar = new njb(context);
            njbVar.setText(jb6.M0(2131751151, null));
            frameLayout2.addView(njbVar, qoe.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            vvb vvbVar = new vvb(this, this, getParentActivity());
            this.f = vvbVar;
            vvbVar.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f.setClipChildren(false);
            frameLayout2.addView(this.f, qoe.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            sn2 e = no4.e(this.F, "");
            this.y = (ko4) e.a;
            this.w = new n99(context);
            sn2 sn2Var = new sn2(e, this.w, 0, 0);
            sn2Var.x = true;
            this.f.setForumIconDrawable(sn2Var);
            this.s = sn2Var;
            n99 n99Var = this.w;
            bf0 bf0Var2 = bf0VarArr[0];
            ArrayList arrayList = n99Var.n;
            if (!arrayList.contains(bf0Var2)) {
                arrayList.add(bf0Var2);
            }
            n99 n99Var2 = this.w;
            bf0 bf0Var3 = bf0VarArr[1];
            ArrayList arrayList2 = n99Var2.n;
            if (!arrayList2.contains(bf0Var3)) {
                arrayList2.add(bf0Var3);
            }
            bf0VarArr[0].setImageDrawable(this.s);
            gm.T3(bf0VarArr[0], true, 1.0f, true, false);
            gm.T3(bf0VarArr[1], false, 1.0f, true, false);
            this.y.d.add(bf0VarArr[0]);
            this.y.d.add(bf0VarArr[1]);
        }
        linearLayout.addView(frameLayout2, qoe.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic5 = this.x;
        if (tL_forumTopic5 != null) {
            this.e.setText(tL_forumTopic5.title);
            g0(Long.valueOf(this.x.icon_emoji_id), true);
        } else {
            g0(0L, true);
        }
        return this.fragmentView;
    }

    public final void g0(Long l, boolean z) {
        long longValue;
        bf0[] bf0VarArr = this.h;
        if (this.f != null && this.w != null) {
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            this.f.setSelected(Long.valueOf(longValue));
            if (this.b != longValue) {
                if (!z && longValue != 0 && !getUserConfig().p()) {
                    TLRPC.Document e = vm.e(this.currentAccount, l.longValue());
                    if (e != null) {
                        c41.b0(this).r(e, gm.S2(jb6.M0(2131743551, null)), jb6.M0(2131746768, null), new rvb(this, (byte) 0)).j();
                        return;
                    }
                    return;
                }
                this.b = longValue;
                if (longValue != 0) {
                    vm vmVar = new vm(10, this.currentAccount, longValue);
                    vmVar.setColorFilter(cmb.u3);
                    bf0VarArr[1].setAnimatedEmojiDrawable(vmVar);
                    bf0VarArr[1].setImageDrawable(null);
                } else {
                    o26 o26Var = new o26(1, null);
                    o26Var.a(this.n);
                    this.w.b(o26Var, false);
                    bf0VarArr[1].setImageDrawable(this.s);
                    bf0VarArr[1].setAnimatedEmojiDrawable(null);
                }
                bf0 bf0Var = bf0VarArr[0];
                bf0 bf0Var2 = bf0VarArr[1];
                bf0VarArr[0] = bf0Var2;
                bf0VarArr[1] = bf0Var;
                gm.T3(bf0Var2, true, 0.5f, true, true);
                gm.T3(bf0VarArr[1], false, 0.5f, true, true);
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
            this.F = ko4.k[Math.abs(Utilities.b.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        gm.E3(this.e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z && this.r) {
            removeSelfFromStack();
        }
        this.G.e();
        vvb vvbVar = this.f;
        if (vvbVar != null) {
            vvbVar.setAnimationsEnabled(this.fragmentBeginToShow);
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
