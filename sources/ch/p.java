package ch;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.a3;
import c8.l9;
import c8.ma;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.x5;
import org.telegram.ui.r01;
public final class p extends h2 implements fs {
    public final Paint E;
    public e51 F;
    public final ArrayList G;
    public final ArrayList H;
    public final LinkedHashMap I;
    public final ArrayList J;
    public final LinkedHashMap K;
    public final ArrayList L;
    public boolean M;
    public int N;
    public final int O;
    public boolean P;
    public boolean Q;
    public te.a R;
    public final TLRPC.ChatFull S;
    public final long T;
    public int U;
    public int V;
    public TLRPC.Chat W;
    public TL_stories.TL_premium_boostsStatus X;
    public int Y;
    public int Z;
    public boolean f5458a;
    public boolean f5459a0;
    public n f5460b;
    public final h f5461b0;
    public a3 f5462c;
    public f d;
    public s8 f5463e;
    public a9 f5464f;
    public m h;
    public u7 f5465n;
    public s8 f5466r;
    public t0 f5467s;
    public FrameLayout f5468w;
    public ImageView f5469x;
    public int f5470y;

    public p(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().B4;
        this.P = false;
        this.Z = -1;
        this.f5461b0 = new h(this, 6);
        this.T = j3;
        this.S = chatFull;
    }

    public final void b0(View view, boolean z10) {
        this.G.add(view);
        this.H.add(Boolean.valueOf(z10));
    }

    public final void c0(x5 x5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(x5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            x5[] x5VarArr = (x5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), x5.class);
            for (x5 x5Var2 : x5VarArr) {
                x5Var2.setAnimateChanges();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (d0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r25) {
        throw new UnsupportedOperationException("Method not decompiled: ch.p.createView(android.content.Context):android.view.View");
    }

    public final boolean d0(boolean z10) {
        boolean z11 = !this.I.keySet().equals(this.K.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.Y) {
            z11 = false;
        }
        if (this.M != this.f5458a) {
            z11 = true;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = gd.M0(2131743598, "UnsavedChanges");
            u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = gd.M0(2131746212, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(gd.M0(2131754214, "ApplyTheme"), new r1(this) {
                public final p f5357b;

                {
                    this.f5357b = this;
                }

                @Override
                public final void h(u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f5357b.f5467s.performClick();
                            return;
                        default:
                            this.f5357b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(gd.M0(2131751395, null), new r1(this) {
                public final p f5357b;

                {
                    this.f5357b = this;
                }

                @Override
                public final void h(u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f5357b.f5467s.performClick();
                            return;
                        default:
                            this.f5357b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
        }
        return z11;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25226y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            s4 s4Var = this.parentLayout;
            if (s4Var != null && s4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(boolean z10) {
        if (this.X == null) {
            return;
        }
        if (this.Z == 0) {
            this.Z = 1;
        }
        int size = h0(true).size();
        this.Y = size;
        if (this.X.level < size) {
            if (z10) {
                lc.b0(this).Q(2131623982, 36, org.telegram.messenger.g0.W2(gd.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
            }
            this.f5467s.setLvlRequiredState(this.Y);
            return;
        }
        this.f5467s.g(null, true);
    }

    public final void f0() {
        if (this.P) {
            this.P = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.F.setFocusableInTouchMode(true);
                this.F.requestFocus();
            } else {
                this.h.clearFocus();
            }
            ks.e().k(ks.f25135j1, 512);
            this.f5462c.setLayerType(2, null);
            this.R.a(false, true);
        }
    }

    public final boolean g0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, x5.class);
        for (x5 x5Var : x5VarArr) {
            this.I.remove(Long.valueOf(x5Var.documentId));
            this.J.remove(Long.valueOf(x5Var.documentId));
            this.f5460b.A(Long.valueOf(x5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        e0(false);
        return true;
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.F;
    }

    public final ArrayList h0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.J;
        int size = arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            Long l10 = (Long) obj;
            if (l10.longValue() != -1) {
                ArrayList arrayList4 = this.L;
                int size2 = arrayList4.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size2) {
                        Object obj2 = arrayList4.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l10.longValue() == tL_availableReaction.activate_animation.f28409id) {
                            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                            tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                            arrayList.add(tL_reactionEmoji);
                            break;
                        }
                    } else {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l10.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                }
            }
        }
        if (z10) {
            return arrayList2;
        }
        return arrayList;
    }

    public final void i0(int i7, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        if (this.Z != i7 || this.f5458a != z10) {
            this.f5458a = z10;
            if (i7 != 1 && i7 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f5463e.setChecked(z12);
            if (z12) {
                i10 = n6.f29432f6;
            } else {
                i10 = n6.f29413e6;
            }
            int x02 = n6.x0(null, i10, false);
            if (z11) {
                if (z12) {
                    this.f5463e.b(x02, true);
                } else {
                    this.f5463e.setBackgroundColorAnimatedReverse(x02);
                }
            } else {
                s8 s8Var = this.f5463e;
                if (z12) {
                    i11 = n6.f29432f6;
                } else {
                    i11 = n6.f29413e6;
                }
                u6.h(i11, s8Var, null);
            }
            this.Z = i7;
            if (i7 != 1 && i7 != 0 && !z10) {
                if (z11) {
                    f0();
                    this.f5468w.animate().setListener(null).cancel();
                    this.f5468w.animate().alpha(0.0f).setDuration(350L).setInterpolator(lr.f37208f).setListener(new ai.j0(this, 3)).start();
                    this.h.setFocusableInTouchMode(false);
                    this.F.f34607g3.O(true);
                    return;
                }
                this.f5468w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.f34607g3.O(false);
                return;
            }
            this.f5468w.setVisibility(0);
            this.F.f34607g3.O(z11);
            if (z11) {
                this.f5468w.animate().setListener(null).cancel();
                this.f5468w.animate().alpha(1.0f).setDuration(350L).setInterpolator(lr.f37208f).start();
                this.F.post(new h(this, 1));
                LinkedHashMap linkedHashMap = this.I;
                if (linkedHashMap.isEmpty()) {
                    this.f5460b.L.clear();
                    this.h.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.L;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        s0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.J, spannableStringBuilder, this.f5460b, this.h.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.O) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.h.append(spannableStringBuilder);
                    this.h.J();
                    r01 r01Var = this.f5460b.f51412q0;
                    if (r01Var != null) {
                        r01Var.f();
                    }
                    e0(false);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(float f10) {
        float a10 = l9.a(f10, 0.0f, 1.0f);
        a3 a3Var = this.f5462c;
        if (a3Var != null && this.f5468w != null) {
            a3Var.setTranslationY((1.0f - a10) * a3Var.getMeasuredHeight());
            this.f5468w.setTranslationY((-a10) * this.f5462c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        s8 s8Var = this.f5466r;
        boolean z10 = s8Var.f31783e.h;
        int i7 = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z10) {
            s8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            x5 x5Var = (x5) linkedHashMap.remove(-1L);
            if (x5Var != null) {
                x5Var.setRemoved(new c1.c(1, this, x5Var));
            }
            c0(x5Var);
            this.f5460b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i7);
            i0(this.Z, this.f5458a, true);
        } else {
            s8Var.setChecked(true);
            try {
                this.h.setMaxLength(i7 + 1);
                SpannableString spannableString = new SpannableString("b");
                o oVar = new o(this);
                oVar.cacheType = o5.f();
                oVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, oVar);
                spannableString.setSpan(oVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.f5460b.x(-1L, true);
                e0(true);
                c0(oVar);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            i0(this.Z, true, true);
        }
        this.h.k(true);
    }

    public final void l0() {
        float f10;
        if (this.f5468w != null && this.f5467s != null) {
            te.a aVar = this.R;
            if (aVar != null) {
                f10 = aVar.f57657e;
            } else {
                f10 = 0.0f;
            }
            int round = Math.round((1.0f - f10) * this.f5470y);
            ViewGroup.LayoutParams layoutParams = this.f5468w.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(74.0f) + round;
            this.f5468w.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f5467s.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(13.0f) + round;
            this.f5467s.setLayoutParams(layoutParams2);
        }
    }

    public final void m0() {
        if (this.f5462c != null) {
            this.E.setColor(n6.w0(n6.f29394d6, this.resourceProvider));
            this.f5462c.setPadding(0, 0, 0, this.f5470y);
            this.f5462c.invalidate();
        }
    }

    public final void n0() {
        float f10;
        if (this.F == null) {
            return;
        }
        te.a aVar = this.R;
        if (aVar != null) {
            f10 = aVar.f57657e;
        } else {
            f10 = 0.0f;
        }
        int W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(12.0f) + Math.max(0, this.f5462c.getMeasuredHeight() - this.mSystemInsets.d));
        e51 e51Var = this.F;
        i0.b bVar = this.mSystemInsets;
        ri.a.e(e51Var, bVar.f15890b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), W1);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.P) {
            if (z10) {
                f0();
                return false;
            }
        } else if (!d0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        mp messagesController = getMessagesController();
        long j3 = this.T;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        this.W = O0;
        if (O0 == null) {
            TLRPC.Chat P = tr.a0(this.currentAccount).P(j3);
            this.W = P;
            if (P != null) {
                getMessagesController().X3(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().I0().a(-j3, new i(this, 0));
            getNotificationCenter().c(this, ks.Y4);
            this.L.addAll(getMediaDataController().f26625n);
            ks.e().k(ks.f25135j1, 512);
            getNotificationCenter().c(this, ks.f25226y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.f5461b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.f5458a))) {
            getMessagesController().R4(this.T, this.Z, h0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, ks.Y4);
        getNotificationCenter().n(this, ks.f25226y1);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f5470y = i12;
        l0();
        m0();
        n0();
    }

    @Override
    public final void onPause() {
        this.f5459a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f5459a0) {
            this.f5459a0 = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.P) {
                this.h.K(false);
                org.telegram.messenger.g0.h3(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            s8 s8Var = this.f5463e;
            if (s8Var != null && (s8Var.getBackground() instanceof ColorDrawable)) {
                s8 s8Var2 = this.f5463e;
                if (s8Var2.f31783e.h) {
                    i7 = n6.f29432f6;
                } else {
                    i7 = n6.f29413e6;
                }
                s8Var2.setBackgroundColor(n6.x0(null, i7, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.Z != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z10) {
            this.Q = true;
        }
        if (z10 && !z11) {
            if (this.f5460b == null) {
                n nVar = new n(this, this, getParentActivity(), getResourceProvider(), n6.w0(n6.G6, getResourceProvider()));
                this.f5460b = nVar;
                nVar.setAnimationsEnabled(false);
                this.f5460b.setClipChildren(false);
                u6.h(n6.f29394d6, this.f5460b, null);
                this.f5462c.addView(this.f5460b, ma.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new i(this, 1));
                this.f5462c.addView(this.d, ma.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    this.f5460b.x((Long) obj, false);
                }
            }
            org.telegram.messenger.g0.h3(new ai.o(6), 200L);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
