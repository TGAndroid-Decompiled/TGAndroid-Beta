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
import bi.e3;
import c8.l9;
import c8.ma;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.y5;
import org.telegram.ui.s01;
public final class p extends g2 implements gs {
    public final Paint E;
    public h51 F;
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
    public boolean f5490a;
    public boolean f5491a0;
    public n f5492b;
    public final h f5493b0;
    public e3 f5494c;
    public f d;
    public s8 f5495e;
    public a9 f5496f;
    public m h;
    public u7 f5497n;
    public s8 f5498r;
    public t0 f5499s;
    public FrameLayout f5500w;
    public ImageView f5501x;
    public int f5502y;

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
        this.f5493b0 = new h(this, 6);
        this.T = j3;
        this.S = chatFull;
    }

    public final void b0(View view, boolean z10) {
        this.G.add(view);
        this.H.add(Boolean.valueOf(z10));
    }

    public final void c0(y5 y5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(y5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            y5[] y5VarArr = (y5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), y5.class);
            for (y5 y5Var2 : y5VarArr) {
                y5Var2.setAnimateChanges();
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
        if (this.M != this.f5490a) {
            z11 = true;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N0 = hd.N0(2131743590, "UnsavedChanges");
            t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            t1Var.U = hd.N0(2131746211, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(hd.N0(2131754213, "ApplyTheme"), new q1(this) {
                public final p f5389b;

                {
                    this.f5389b = this;
                }

                @Override
                public final void h(t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f5389b.f5499s.performClick();
                            return;
                        default:
                            this.f5389b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(hd.N0(2131751394, null), new q1(this) {
                public final p f5389b;

                {
                    this.f5389b = this;
                }

                @Override
                public final void h(t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f5389b.f5499s.performClick();
                            return;
                        default:
                            this.f5389b.finishFragment();
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
        if (i7 == ls.f25420y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            r4 r4Var = this.parentLayout;
            if (r4Var != null && r4Var.getLastFragment() == this) {
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
                lc.b0(this).Q(2131623982, 36, org.telegram.messenger.g0.W2(hd.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
            }
            this.f5499s.setLvlRequiredState(this.Y);
            return;
        }
        this.f5499s.g(null, true);
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
            ls.e().k(ls.f25329j1, 512);
            this.f5494c.setLayerType(2, null);
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
        y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, y5.class);
        for (y5 y5Var : y5VarArr) {
            this.I.remove(Long.valueOf(y5Var.documentId));
            this.J.remove(Long.valueOf(y5Var.documentId));
            this.f5492b.A(Long.valueOf(y5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        e0(false);
        return true;
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
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
                        if (l10.longValue() == tL_availableReaction.activate_animation.f28440id) {
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
        if (this.Z != i7 || this.f5490a != z10) {
            this.f5490a = z10;
            if (i7 != 1 && i7 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f5495e.setChecked(z12);
            if (z12) {
                i10 = m6.f29419f6;
            } else {
                i10 = m6.f29400e6;
            }
            int x02 = m6.x0(null, i10, false);
            if (z11) {
                if (z12) {
                    this.f5495e.b(x02, true);
                } else {
                    this.f5495e.setBackgroundColorAnimatedReverse(x02);
                }
            } else {
                s8 s8Var = this.f5495e;
                if (z12) {
                    i11 = m6.f29419f6;
                } else {
                    i11 = m6.f29400e6;
                }
                t6.h(i11, s8Var, null);
            }
            this.Z = i7;
            if (i7 != 1 && i7 != 0 && !z10) {
                if (z11) {
                    f0();
                    this.f5500w.animate().setListener(null).cancel();
                    this.f5500w.animate().alpha(0.0f).setDuration(350L).setInterpolator(nr.f37961f).setListener(new ai.k0(this, 3)).start();
                    this.h.setFocusableInTouchMode(false);
                    this.F.f35790g3.O(true);
                    return;
                }
                this.f5500w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.f35790g3.O(false);
                return;
            }
            this.f5500w.setVisibility(0);
            this.F.f35790g3.O(z11);
            if (z11) {
                this.f5500w.animate().setListener(null).cancel();
                this.f5500w.animate().alpha(1.0f).setDuration(350L).setInterpolator(nr.f37961f).start();
                this.F.post(new h(this, 1));
                LinkedHashMap linkedHashMap = this.I;
                if (linkedHashMap.isEmpty()) {
                    this.f5492b.L.clear();
                    this.h.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.L;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        s0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.J, spannableStringBuilder, this.f5492b, this.h.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.O) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.h.append(spannableStringBuilder);
                    this.h.J();
                    s01 s01Var = this.f5492b.f51858q0;
                    if (s01Var != null) {
                        s01Var.f();
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
        e3 e3Var = this.f5494c;
        if (e3Var != null && this.f5500w != null) {
            e3Var.setTranslationY((1.0f - a10) * e3Var.getMeasuredHeight());
            this.f5500w.setTranslationY((-a10) * this.f5494c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        s8 s8Var = this.f5498r;
        boolean z10 = s8Var.f31814e.h;
        int i7 = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z10) {
            s8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            y5 y5Var = (y5) linkedHashMap.remove(-1L);
            if (y5Var != null) {
                y5Var.setRemoved(new c1.a(3, this, y5Var));
            }
            c0(y5Var);
            this.f5492b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i7);
            i0(this.Z, this.f5490a, true);
        } else {
            s8Var.setChecked(true);
            try {
                this.h.setMaxLength(i7 + 1);
                SpannableString spannableString = new SpannableString("b");
                o oVar = new o(this);
                oVar.cacheType = p5.f();
                oVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, oVar);
                spannableString.setSpan(oVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.f5492b.x(-1L, true);
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
        if (this.f5500w != null && this.f5499s != null) {
            te.a aVar = this.R;
            if (aVar != null) {
                f10 = aVar.f57700e;
            } else {
                f10 = 0.0f;
            }
            int round = Math.round((1.0f - f10) * this.f5502y);
            ViewGroup.LayoutParams layoutParams = this.f5500w.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(74.0f) + round;
            this.f5500w.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f5499s.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(13.0f) + round;
            this.f5499s.setLayoutParams(layoutParams2);
        }
    }

    public final void m0() {
        if (this.f5494c != null) {
            this.E.setColor(m6.w0(m6.f29381d6, this.resourceProvider));
            this.f5494c.setPadding(0, 0, 0, this.f5502y);
            this.f5494c.invalidate();
        }
    }

    public final void n0() {
        float f10;
        if (this.F == null) {
            return;
        }
        te.a aVar = this.R;
        if (aVar != null) {
            f10 = aVar.f57700e;
        } else {
            f10 = 0.0f;
        }
        int W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(12.0f) + Math.max(0, this.f5494c.getMeasuredHeight() - this.mSystemInsets.d));
        h51 h51Var = this.F;
        i0.b bVar = this.mSystemInsets;
        ri.a.e(h51Var, bVar.f15918b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), W1);
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
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        this.W = O0;
        if (O0 == null) {
            TLRPC.Chat P = ur.a0(this.currentAccount).P(j3);
            this.W = P;
            if (P != null) {
                getMessagesController().X3(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().I0().a(-j3, new i(this, 0));
            getNotificationCenter().c(this, ls.Y4);
            this.L.addAll(getMediaDataController().f26839n);
            ls.e().k(ls.f25329j1, 512);
            getNotificationCenter().c(this, ls.f25420y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.f5493b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.f5490a))) {
            getMessagesController().R4(this.T, this.Z, h0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, ls.Y4);
        getNotificationCenter().n(this, ls.f25420y1);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f5502y = i12;
        l0();
        m0();
        n0();
    }

    @Override
    public final void onPause() {
        this.f5491a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f5491a0) {
            this.f5491a0 = false;
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
            s8 s8Var = this.f5495e;
            if (s8Var != null && (s8Var.getBackground() instanceof ColorDrawable)) {
                s8 s8Var2 = this.f5495e;
                if (s8Var2.f31814e.h) {
                    i7 = m6.f29419f6;
                } else {
                    i7 = m6.f29400e6;
                }
                s8Var2.setBackgroundColor(m6.x0(null, i7, false));
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
            if (this.f5492b == null) {
                n nVar = new n(this, this, getParentActivity(), getResourceProvider(), m6.w0(m6.G6, getResourceProvider()));
                this.f5492b = nVar;
                nVar.setAnimationsEnabled(false);
                this.f5492b.setClipChildren(false);
                t6.h(m6.f29381d6, this.f5492b, null);
                this.f5494c.addView(this.f5492b, ma.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new i(this, 1));
                this.f5494c.addView(this.d, ma.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    this.f5492b.x((Long) obj, false);
                }
            }
            org.telegram.messenger.g0.h3(new ai.n(6), 200L);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
