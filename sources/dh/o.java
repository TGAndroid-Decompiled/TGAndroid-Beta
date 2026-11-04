package dh;

import ai.e1;
import ai.o2;
import ai.y1;
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
import b8.be;
import b8.mf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.g01;
public final class o extends d2 implements cs {
    public final Paint E;
    public l41 F;
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
    public qe.a R;
    public final TLRPC.ChatFull S;
    public final long T;
    public int U;
    public int V;
    public TLRPC.Chat W;
    public TL_stories.TL_premium_boostsStatus X;
    public int Y;
    public int Z;
    public boolean f9099a;
    public boolean f9100a0;
    public m f9101b;
    public final h f9102b0;
    public o2 f9103c;
    public f d;
    public q8 f9104e;
    public y8 f9105f;
    public l h;
    public s7 f9106n;
    public q8 f9107r;
    public q0 f9108s;
    public FrameLayout f9109w;
    public ImageView f9110x;
    public int f9111y;

    public o(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().f23174y4;
        this.P = false;
        this.Z = -1;
        this.f9102b0 = new h(this, 6);
        this.T = j10;
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
        throw new UnsupportedOperationException("Method not decompiled: dh.o.createView(android.content.Context):android.view.View");
    }

    public final boolean d0(boolean z10) {
        boolean z11 = !this.I.keySet().equals(this.K.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.Y) {
            z11 = false;
        }
        if (this.M != this.f9099a) {
            z11 = true;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = bd.M0(2131743845, "UnsavedChanges");
            s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = bd.M0(2131746415, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(bd.M0(2131754216, "ApplyTheme"), new p1(this) {
                public final o f9006b;

                {
                    this.f9006b = this;
                }

                @Override
                public final void g(s1 s1Var2, int i3) {
                    switch (r2) {
                        case 0:
                            this.f9006b.f9108s.performClick();
                            return;
                        default:
                            this.f9006b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(bd.M0(2131751407, null), new p1(this) {
                public final o f9006b;

                {
                    this.f9006b = this;
                }

                @Override
                public final void g(s1 s1Var2, int i3) {
                    switch (r2) {
                        case 0:
                            this.f9006b.f9108s.performClick();
                            return;
                        default:
                            this.f9006b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
        }
        return z11;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23341y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            q4 q4Var = this.parentLayout;
            if (q4Var != null && q4Var.getLastFragment() == this) {
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
                fc.a0(this).Q(2131623981, 36, org.telegram.messenger.g0.X2(bd.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
            }
            this.f9108s.setLvlRequiredState(this.Y);
            return;
        }
        this.f9108s.g(null, true);
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
            hs.e().k(hs.f23249j1, 512);
            this.f9103c.setLayerType(2, null);
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
            this.f9101b.A(Long.valueOf(p5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        e0(false);
        return true;
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.F;
    }

    public final ArrayList h0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.J;
        int size = arrayList3.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList3.get(i3);
            i3++;
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
                        if (l10.longValue() == tL_availableReaction.activate_animation.f27007id) {
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

    public final void i0(int i3, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        if (this.Z != i3 || this.f9099a != z10) {
            this.f9099a = z10;
            if (i3 != 1 && i3 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f9104e.setChecked(z12);
            if (z12) {
                i10 = k6.f27917f6;
            } else {
                i10 = k6.f27898e6;
            }
            int x02 = k6.x0(null, i10, false);
            if (z11) {
                if (z12) {
                    this.f9104e.b(x02, true);
                } else {
                    this.f9104e.setBackgroundColorAnimatedReverse(x02);
                }
            } else {
                q8 q8Var = this.f9104e;
                if (z12) {
                    i11 = k6.f27917f6;
                } else {
                    i11 = k6.f27898e6;
                }
                r6.i(i11, q8Var, null);
            }
            this.Z = i3;
            if (i3 != 1 && i3 != 0 && !z10) {
                if (z11) {
                    f0();
                    this.f9109w.animate().setListener(null).cancel();
                    this.f9109w.animate().alpha(0.0f).setDuration(350L).setInterpolator(xq.f40452f).setListener(new e1(this, 4)).start();
                    this.h.setFocusableInTouchMode(false);
                    this.F.f35594g3.O(true);
                    return;
                }
                this.f9109w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.f35594g3.O(false);
                return;
            }
            this.f9109w.setVisibility(0);
            this.F.f35594g3.O(z11);
            if (z11) {
                this.f9109w.animate().setListener(null).cancel();
                this.f9109w.animate().alpha(1.0f).setDuration(350L).setInterpolator(xq.f40452f).start();
                this.F.post(new h(this, 1));
                LinkedHashMap linkedHashMap = this.I;
                if (linkedHashMap.isEmpty()) {
                    this.f9101b.L.clear();
                    this.h.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.L;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        p0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.J, spannableStringBuilder, this.f9101b, this.h.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.O) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.h.append(spannableStringBuilder);
                    this.h.I();
                    g01 g01Var = this.f9101b.f45470q0;
                    if (g01Var != null) {
                        g01Var.f();
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
        float a10 = be.a(f10, 0.0f, 1.0f);
        o2 o2Var = this.f9103c;
        if (o2Var != null && this.f9109w != null) {
            o2Var.setTranslationY((1.0f - a10) * o2Var.getMeasuredHeight());
            this.f9109w.setTranslationY((-a10) * this.f9103c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        q8 q8Var = this.f9107r;
        boolean z10 = q8Var.f30234e.h;
        int i3 = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z10) {
            q8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            p5 p5Var = (p5) linkedHashMap.remove(-1L);
            if (p5Var != null) {
                p5Var.setRemoved(new ci.e0(20, this, p5Var));
            }
            c0(p5Var);
            this.f9101b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i3);
            i0(this.Z, this.f9099a, true);
        } else {
            q8Var.setChecked(true);
            try {
                this.h.setMaxLength(i3 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = g5.f();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.f9101b.x(-1L, true);
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
        if (this.f9109w != null && this.f9108s != null) {
            qe.a aVar = this.R;
            if (aVar != null) {
                f10 = aVar.f53840e;
            } else {
                f10 = 0.0f;
            }
            int round = Math.round((1.0f - f10) * this.f9111y);
            ViewGroup.LayoutParams layoutParams = this.f9109w.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(74.0f) + round;
            this.f9109w.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f9108s.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(13.0f) + round;
            this.f9108s.setLayoutParams(layoutParams2);
        }
    }

    public final void m0() {
        if (this.f9103c != null) {
            this.E.setColor(k6.w0(k6.f27878d6, this.resourceProvider));
            this.f9103c.setPadding(0, 0, 0, this.f9111y);
            this.f9103c.invalidate();
        }
    }

    public final void n0() {
        float f10;
        if (this.F == null) {
            return;
        }
        qe.a aVar = this.R;
        if (aVar != null) {
            f10 = aVar.f53840e;
        } else {
            f10 = 0.0f;
        }
        int W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(12.0f) + Math.max(0, this.f9103c.getMeasuredHeight() - this.mSystemInsets.d));
        l41 l41Var = this.F;
        i0.b bVar = this.mSystemInsets;
        pi.a.e(l41Var, bVar.f14496b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), W1);
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
        hp messagesController = getMessagesController();
        long j10 = this.T;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        this.W = M0;
        if (M0 == null) {
            TLRPC.Chat P = qr.a0(this.currentAccount).P(j10);
            this.W = P;
            if (P != null) {
                getMessagesController().Q3(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().G0().a(-j10, new i(this, 0));
            getNotificationCenter().c(this, hs.V4);
            this.L.addAll(getMediaDataController().f24036n);
            hs.e().k(hs.f23249j1, 512);
            getNotificationCenter().c(this, hs.f23341y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.f9102b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.f9099a))) {
            getMessagesController().G4(this.T, this.Z, h0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, hs.V4);
        getNotificationCenter().n(this, hs.f23341y1);
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f9111y = i12;
        l0();
        m0();
        n0();
    }

    @Override
    public final void onPause() {
        this.f9100a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f9100a0) {
            this.f9100a0 = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.P) {
                this.h.J(false);
                org.telegram.messenger.g0.i3(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i3;
        try {
            super.onThemeColorsChanged();
            q8 q8Var = this.f9104e;
            if (q8Var != null && (q8Var.getBackground() instanceof ColorDrawable)) {
                q8 q8Var2 = this.f9104e;
                if (q8Var2.f30234e.h) {
                    i3 = k6.f27917f6;
                } else {
                    i3 = k6.f27898e6;
                }
                q8Var2.setBackgroundColor(k6.x0(null, i3, false));
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
            if (this.f9101b == null) {
                m mVar = new m(this, this, getParentActivity(), getResourceProvider(), k6.w0(k6.G6, getResourceProvider()));
                this.f9101b = mVar;
                mVar.setAnimationsEnabled(false);
                this.f9101b.setClipChildren(false);
                r6.i(k6.f27878d6, this.f9101b, null);
                this.f9103c.addView(this.f9101b, mf.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new i(this, 1));
                this.f9103c.addView(this.d, mf.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    this.f9101b.x((Long) obj, false);
                }
            }
            org.telegram.messenger.g0.i3(new y1(7), 200L);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
