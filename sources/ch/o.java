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
import bi.g2;
import c8.i9;
import c8.ja;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.n01;
public final class o extends e2 implements is {
    public final Paint E;
    public u41 F;
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
    public boolean f5168a;
    public boolean f5169a0;
    public m f5170b;
    public final h f5171b0;
    public g2 f5172c;
    public f d;
    public q8 f5173e;
    public y8 f5174f;
    public l h;
    public s7 f5175n;
    public q8 f5176r;
    public t0 f5177s;
    public FrameLayout f5178w;
    public ImageView f5179x;
    public int f5180y;

    public o(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().f25454z4;
        this.P = false;
        this.Z = -1;
        this.f5171b0 = new h(this, 6);
        this.T = j3;
        this.S = chatFull;
    }

    public final void b0(View view, boolean z10) {
        this.G.add(view);
        this.H.add(Boolean.valueOf(z10));
    }

    public final void c0(p5 p5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(p5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            p5[] p5VarArr = (p5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), p5.class);
            for (p5 p5Var2 : p5VarArr) {
                p5Var2.setAnimateChanges();
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
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: ch.o.createView(android.content.Context):android.view.View");
    }

    public final boolean d0(boolean z10) {
        boolean z11 = !this.I.keySet().equals(this.K.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.Y) {
            z11 = false;
        }
        if (this.M != this.f5168a) {
            z11 = true;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = hd.M0(2131743835, "UnsavedChanges");
            t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = hd.M0(2131746407, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(hd.M0(2131754216, "ApplyTheme"), new q1(this) {
                public final o f5071b;

                {
                    this.f5071b = this;
                }

                @Override
                public final void h(t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f5071b.f5177s.performClick();
                            return;
                        default:
                            this.f5071b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(hd.M0(2131751406, null), new q1(this) {
                public final o f5071b;

                {
                    this.f5071b = this;
                }

                @Override
                public final void h(t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f5071b.f5177s.performClick();
                            return;
                        default:
                            this.f5071b.finishFragment();
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
        if (i7 == ns.f25608y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            o4 o4Var = this.parentLayout;
            if (o4Var != null && o4Var.getLastFragment() == this) {
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
                cc.a0(this).Q(2131623982, 36, org.telegram.messenger.g0.X2(hd.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
            }
            this.f5177s.setLvlRequiredState(this.Y);
            return;
        }
        this.f5177s.g(null, true);
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
            ns.e().k(ns.f25517j1, 512);
            this.f5172c.setLayerType(2, null);
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
        p5[] p5VarArr = (p5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, p5.class);
        for (p5 p5Var : p5VarArr) {
            this.I.remove(Long.valueOf(p5Var.documentId));
            this.J.remove(Long.valueOf(p5Var.documentId));
            this.f5170b.A(Long.valueOf(p5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        e0(false);
        return true;
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
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
                        if (l10.longValue() == tL_availableReaction.activate_animation.f28057id) {
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
        if (this.Z != i7 || this.f5168a != z10) {
            this.f5168a = z10;
            if (i7 != 1 && i7 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f5173e.setChecked(z12);
            if (z12) {
                i10 = j6.f28887f6;
            } else {
                i10 = j6.f28868e6;
            }
            int x02 = j6.x0(null, i10, false);
            if (z11) {
                if (z12) {
                    this.f5173e.b(x02, true);
                } else {
                    this.f5173e.setBackgroundColorAnimatedReverse(x02);
                }
            } else {
                q8 q8Var = this.f5173e;
                if (z12) {
                    i11 = j6.f28887f6;
                } else {
                    i11 = j6.f28868e6;
                }
                q6.h(i11, q8Var, null);
            }
            this.Z = i7;
            if (i7 != 1 && i7 != 0 && !z10) {
                if (z11) {
                    f0();
                    this.f5178w.animate().setListener(null).cancel();
                    this.f5178w.animate().alpha(0.0f).setDuration(350L).setInterpolator(er.f34420f).setListener(new ai.i0(this, 3)).start();
                    this.h.setFocusableInTouchMode(false);
                    this.F.f39895g3.O(true);
                    return;
                }
                this.f5178w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.f39895g3.O(false);
                return;
            }
            this.f5178w.setVisibility(0);
            this.F.f39895g3.O(z11);
            if (z11) {
                this.f5178w.animate().setListener(null).cancel();
                this.f5178w.animate().alpha(1.0f).setDuration(350L).setInterpolator(er.f34420f).start();
                this.F.post(new h(this, 1));
                LinkedHashMap linkedHashMap = this.I;
                if (linkedHashMap.isEmpty()) {
                    this.f5170b.L.clear();
                    this.h.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.L;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        s0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.J, spannableStringBuilder, this.f5170b, this.h.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.O) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.h.append(spannableStringBuilder);
                    this.h.J();
                    n01 n01Var = this.f5170b.f49400q0;
                    if (n01Var != null) {
                        n01Var.f();
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
        float a10 = i9.a(f10, 0.0f, 1.0f);
        g2 g2Var = this.f5172c;
        if (g2Var != null && this.f5178w != null) {
            g2Var.setTranslationY((1.0f - a10) * g2Var.getMeasuredHeight());
            this.f5178w.setTranslationY((-a10) * this.f5172c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        q8 q8Var = this.f5176r;
        boolean z10 = q8Var.f31310e.h;
        int i7 = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z10) {
            q8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            p5 p5Var = (p5) linkedHashMap.remove(-1L);
            if (p5Var != null) {
                p5Var.setRemoved(new c1.c(2, this, p5Var));
            }
            c0(p5Var);
            this.f5170b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i7);
            i0(this.Z, this.f5168a, true);
        } else {
            q8Var.setChecked(true);
            try {
                this.h.setMaxLength(i7 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = g5.f();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.f5170b.x(-1L, true);
                e0(true);
                c0(nVar);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            i0(this.Z, true, true);
        }
        this.h.k(true);
    }

    public final void l0() {
        float f10;
        if (this.f5178w != null && this.f5177s != null) {
            te.a aVar = this.R;
            if (aVar != null) {
                f10 = aVar.f57081e;
            } else {
                f10 = 0.0f;
            }
            int round = Math.round((1.0f - f10) * this.f5180y);
            ViewGroup.LayoutParams layoutParams = this.f5178w.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(74.0f) + round;
            this.f5178w.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f5177s.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(13.0f) + round;
            this.f5177s.setLayoutParams(layoutParams2);
        }
    }

    public final void m0() {
        if (this.f5172c != null) {
            this.E.setColor(j6.w0(j6.f28849d6, this.resourceProvider));
            this.f5172c.setPadding(0, 0, 0, this.f5180y);
            this.f5172c.invalidate();
        }
    }

    public final void n0() {
        float f10;
        if (this.F == null) {
            return;
        }
        te.a aVar = this.R;
        if (aVar != null) {
            f10 = aVar.f57081e;
        } else {
            f10 = 0.0f;
        }
        int W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(12.0f) + Math.max(0, this.f5172c.getMeasuredHeight() - this.mSystemInsets.d));
        u41 u41Var = this.F;
        i0.c cVar = this.mSystemInsets;
        ri.a.e(u41Var, cVar.f15575b, cVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), W1);
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
        np messagesController = getMessagesController();
        long j3 = this.T;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        this.W = M0;
        if (M0 == null) {
            TLRPC.Chat P = vr.a0(this.currentAccount).P(j3);
            this.W = P;
            if (P != null) {
                getMessagesController().Q3(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().G0().a(-j3, new i(this, 0));
            getNotificationCenter().c(this, ns.V4);
            this.L.addAll(getMediaDataController().f26487n);
            ns.e().k(ns.f25517j1, 512);
            getNotificationCenter().c(this, ns.f25608y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.f5171b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.f5168a))) {
            getMessagesController().H4(this.T, this.Z, h0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, ns.V4);
        getNotificationCenter().n(this, ns.f25608y1);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f5180y = i12;
        l0();
        m0();
        n0();
    }

    @Override
    public final void onPause() {
        this.f5169a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f5169a0) {
            this.f5169a0 = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.P) {
                this.h.K(false);
                org.telegram.messenger.g0.i3(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            q8 q8Var = this.f5173e;
            if (q8Var != null && (q8Var.getBackground() instanceof ColorDrawable)) {
                q8 q8Var2 = this.f5173e;
                if (q8Var2.f31310e.h) {
                    i7 = j6.f28887f6;
                } else {
                    i7 = j6.f28868e6;
                }
                q8Var2.setBackgroundColor(j6.x0(null, i7, false));
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
            if (this.f5170b == null) {
                m mVar = new m(this, this, getParentActivity(), getResourceProvider(), j6.w0(j6.G6, getResourceProvider()));
                this.f5170b = mVar;
                mVar.setAnimationsEnabled(false);
                this.f5170b.setClipChildren(false);
                q6.h(j6.f28849d6, this.f5170b, null);
                this.f5172c.addView(this.f5170b, ja.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new i(this, 1));
                this.f5172c.addView(this.d, ja.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    this.f5170b.x((Long) obj, false);
                }
            }
            org.telegram.messenger.g0.i3(new ai.o(5), 200L);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
