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
import bi.a4;
import bi.e5;
import bi.t5;
import c8.ha;
import c8.j9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.q01;
public final class o extends f2 implements ls {
    public final Paint D;
    public q41 E;
    public final ArrayList F;
    public final ArrayList G;
    public final LinkedHashMap H;
    public final ArrayList I;
    public final LinkedHashMap J;
    public final ArrayList K;
    public boolean L;
    public int M;
    public final int N;
    public boolean O;
    public boolean P;
    public te.a Q;
    public final TLRPC.ChatFull R;
    public final long S;
    public int T;
    public int U;
    public TLRPC.Chat V;
    public TL_stories.TL_premium_boostsStatus W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean f6340a;
    public final h f6341a0;
    public m f6342b;
    public e5 f6343c;
    public f d;
    public r8 f6344e;
    public z8 f6345f;
    public l h;
    public t7 f6346n;
    public r8 f6347r;
    public r0 f6348s;
    public FrameLayout f6349w;
    public ImageView f6350x;
    public int f6351y;

    public o(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.D = new Paint();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new LinkedHashMap();
        this.I = new ArrayList();
        this.J = new LinkedHashMap();
        this.K = new ArrayList();
        this.N = getMessagesController().f24942y4;
        this.O = false;
        this.Y = -1;
        this.f6341a0 = new h(this, 6);
        this.S = j3;
        this.R = chatFull;
    }

    public final void b0(View view, boolean z9) {
        this.F.add(view);
        this.G.add(Boolean.valueOf(z9));
    }

    public final void c0(r5 r5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(r5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            r5[] r5VarArr = (r5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), r5.class);
            for (r5 r5Var2 : r5VarArr) {
                r5Var2.setAnimateChanges();
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

    public final boolean d0(boolean z9) {
        boolean z10 = !this.H.keySet().equals(this.J.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.X) {
            z10 = false;
        }
        if (this.L != this.f6340a) {
            z10 = true;
        }
        if (z9 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = hd.M0(2131743836, "UnsavedChanges");
            u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = M0;
            u1Var.T = hd.M0(2131746406, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(hd.M0(2131754216, "ApplyTheme"), new r1(this) {
                public final o f6251b;

                {
                    this.f6251b = this;
                }

                @Override
                public final void g(u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f6251b.f6348s.performClick();
                            return;
                        default:
                            this.f6251b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(hd.M0(2131751407, null), new r1(this) {
                public final o f6251b;

                {
                    this.f6251b = this;
                }

                @Override
                public final void g(u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f6251b.f6348s.performClick();
                            return;
                        default:
                            this.f6251b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
        }
        return z10;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25103y1 && ((Long) objArr[0]).longValue() == (-this.S)) {
            q4 q4Var = this.parentLayout;
            if (q4Var != null && q4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(boolean z9) {
        if (this.W == null) {
            return;
        }
        if (this.Y == 0) {
            this.Y = 1;
        }
        int size = h0(true).size();
        this.X = size;
        if (this.W.level < size) {
            if (z9) {
                hc.a0(this).Q(2131623981, 36, org.telegram.messenger.g0.X2(hd.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
            }
            this.f6348s.setLvlRequiredState(this.X);
            return;
        }
        this.f6348s.g(null, true);
    }

    public final void f0() {
        if (this.O) {
            this.O = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.E.setFocusableInTouchMode(true);
                this.E.requestFocus();
            } else {
                this.h.clearFocus();
            }
            qs.e().k(qs.f25012j1, 512);
            this.f6343c.setLayerType(2, null);
            this.Q.a(false, true);
        }
    }

    public final boolean g0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        r5[] r5VarArr = (r5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, r5.class);
        for (r5 r5Var : r5VarArr) {
            this.H.remove(Long.valueOf(r5Var.documentId));
            this.I.remove(Long.valueOf(r5Var.documentId));
            this.f6342b.A(Long.valueOf(r5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        e0(false);
        return true;
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.E;
    }

    public final ArrayList h0(boolean z9) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.I;
        int size = arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            Long l10 = (Long) obj;
            if (l10.longValue() != -1) {
                ArrayList arrayList4 = this.K;
                int size2 = arrayList4.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size2) {
                        Object obj2 = arrayList4.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l10.longValue() == tL_availableReaction.activate_animation.f26959id) {
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
        if (z9) {
            return arrayList2;
        }
        return arrayList;
    }

    public final void i0(int i7, boolean z9, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        if (this.Y != i7 || this.f6340a != z9) {
            this.f6340a = z9;
            if (i7 != 1 && i7 != 0 && !z9) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f6344e.setChecked(z11);
            if (z11) {
                i10 = k6.f27887f6;
            } else {
                i10 = k6.f27868e6;
            }
            int x02 = k6.x0(null, i10, false);
            if (z10) {
                if (z11) {
                    this.f6344e.b(x02, true);
                } else {
                    this.f6344e.setBackgroundColorAnimatedReverse(x02);
                }
            } else {
                r8 r8Var = this.f6344e;
                if (z11) {
                    i11 = k6.f27887f6;
                } else {
                    i11 = k6.f27868e6;
                }
                r6.i(i11, r8Var, null);
            }
            this.Y = i7;
            if (i7 != 1 && i7 != 0 && !z9) {
                if (z10) {
                    f0();
                    this.f6349w.animate().setListener(null).cancel();
                    this.f6349w.animate().alpha(0.0f).setDuration(350L).setInterpolator(xq.f40345f).setListener(new t5(this, 3)).start();
                    this.h.setFocusableInTouchMode(false);
                    this.E.f37160f3.O(true);
                    return;
                }
                this.f6349w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.E.f37160f3.O(false);
                return;
            }
            this.f6349w.setVisibility(0);
            this.E.f37160f3.O(z10);
            if (z10) {
                this.f6349w.animate().setListener(null).cancel();
                this.f6349w.animate().alpha(1.0f).setDuration(350L).setInterpolator(xq.f40345f).start();
                this.E.post(new h(this, 1));
                LinkedHashMap linkedHashMap = this.H;
                if (linkedHashMap.isEmpty()) {
                    this.f6342b.K.clear();
                    this.h.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.K;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        q0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.I, spannableStringBuilder, this.f6342b, this.h.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.N) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.h.append(spannableStringBuilder);
                    this.h.I();
                    q01 q01Var = this.f6342b.f49048p0;
                    if (q01Var != null) {
                        q01Var.f();
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
        float a10 = j9.a(f10, 0.0f, 1.0f);
        e5 e5Var = this.f6343c;
        if (e5Var != null && this.f6349w != null) {
            e5Var.setTranslationY((1.0f - a10) * e5Var.getMeasuredHeight());
            this.f6349w.setTranslationY((-a10) * this.f6343c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        r8 r8Var = this.f6347r;
        boolean z9 = r8Var.f30206e.h;
        int i7 = this.N;
        LinkedHashMap linkedHashMap = this.H;
        ArrayList arrayList = this.I;
        if (z9) {
            r8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            r5 r5Var = (r5) linkedHashMap.remove(-1L);
            if (r5Var != null) {
                r5Var.setRemoved(new a4(15, this, r5Var));
            }
            c0(r5Var);
            this.f6342b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i7);
            i0(this.Y, this.f6340a, true);
        } else {
            r8Var.setChecked(true);
            try {
                this.h.setMaxLength(i7 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = i5.f();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.f6342b.x(-1L, true);
                e0(true);
                c0(nVar);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            i0(this.Y, true, true);
        }
        this.h.k(true);
    }

    public final void l0() {
        float f10;
        if (this.f6349w != null && this.f6348s != null) {
            te.a aVar = this.Q;
            if (aVar != null) {
                f10 = aVar.f55394e;
            } else {
                f10 = 0.0f;
            }
            int round = Math.round((1.0f - f10) * this.f6351y);
            ViewGroup.LayoutParams layoutParams = this.f6349w.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(74.0f) + round;
            this.f6349w.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f6348s.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(13.0f) + round;
            this.f6348s.setLayoutParams(layoutParams2);
        }
    }

    public final void m0() {
        if (this.f6343c != null) {
            this.D.setColor(k6.w0(k6.f27849d6, this.resourceProvider));
            this.f6343c.setPadding(0, 0, 0, this.f6351y);
            this.f6343c.invalidate();
        }
    }

    public final void n0() {
        float f10;
        if (this.E == null) {
            return;
        }
        te.a aVar = this.Q;
        if (aVar != null) {
            f10 = aVar.f55394e;
        } else {
            f10 = 0.0f;
        }
        int W1 = org.telegram.messenger.g0.W1(f10, org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(12.0f) + Math.max(0, this.f6343c.getMeasuredHeight() - this.mSystemInsets.d));
        q41 q41Var = this.E;
        i0.b bVar = this.mSystemInsets;
        oi.a.e(q41Var, bVar.f15118b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), W1);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.O) {
            if (z9) {
                f0();
                return false;
            }
        } else if (!d0(z9)) {
            return super.onBackPressed(z9);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        qp messagesController = getMessagesController();
        long j3 = this.S;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        this.V = M0;
        if (M0 == null) {
            TLRPC.Chat P = yr.a0(this.currentAccount).P(j3);
            this.V = P;
            if (P != null) {
                getMessagesController().Q3(this.V, true);
            }
            return false;
        }
        if (this.R != null) {
            getMessagesController().G0().a(-j3, new i(this, 0));
            getNotificationCenter().c(this, qs.V4);
            this.K.addAll(getMediaDataController().f25825n);
            qs.e().k(qs.f25012j1, 512);
            getNotificationCenter().c(this, qs.f25103y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.f6341a0);
        if (this.Y == 2 && (this.U != this.T || (this.M != 2 && !this.L && !this.f6340a))) {
            getMessagesController().G4(this.S, this.Y, h0(false), this.U, null, null, null);
        }
        getNotificationCenter().n(this, qs.V4);
        getNotificationCenter().n(this, qs.f25103y1);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f6351y = i12;
        l0();
        m0();
        n0();
    }

    @Override
    public final void onPause() {
        this.Z = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.Z) {
            this.Z = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.O) {
                this.h.J(false);
                org.telegram.messenger.g0.i3(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            r8 r8Var = this.f6344e;
            if (r8Var != null && (r8Var.getBackground() instanceof ColorDrawable)) {
                r8 r8Var2 = this.f6344e;
                if (r8Var2.f30206e.h) {
                    i7 = k6.f27887f6;
                } else {
                    i7 = k6.f27868e6;
                }
                r8Var2.setBackgroundColor(k6.x0(null, i7, false));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && this.Y != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z9) {
            this.P = true;
        }
        if (z9 && !z10) {
            if (this.f6342b == null) {
                m mVar = new m(this, this, getParentActivity(), getResourceProvider(), k6.w0(k6.G6, getResourceProvider()));
                this.f6342b = mVar;
                mVar.setAnimationsEnabled(false);
                this.f6342b.setClipChildren(false);
                r6.i(k6.f27849d6, this.f6342b, null);
                this.f6343c.addView(this.f6342b, ha.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new i(this, 1));
                this.f6343c.addView(this.d, ha.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    this.f6342b.x((Long) obj, false);
                }
            }
            org.telegram.messenger.g0.i3(new ai.m0(6), 200L);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
