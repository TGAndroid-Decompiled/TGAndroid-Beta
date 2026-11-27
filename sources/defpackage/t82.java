package defpackage;

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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class t82 extends e implements fn7 {
    public final Paint E;
    public q9c F;
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
    public fm0 R;
    public final TLRPC.ChatFull S;
    public final long T;
    public int U;
    public int V;
    public TLRPC.Chat W;
    public TL_stories.TL_premium_boostsStatus X;
    public int Y;
    public int Z;
    public boolean a;
    public boolean a0;
    public r82 b;
    public final l82 b0;
    public zc c;
    public jd0 d;
    public wkb e;
    public ilb f;
    public q82 h;
    public bna n;
    public wkb r;
    public mac s;
    public FrameLayout w;
    public ImageView x;
    public int y;

    public t82(long j, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().k4.a2.f();
        this.P = false;
        this.Z = -1;
        this.b0 = new l82(this, (byte) 6);
        this.T = j;
        this.S = chatFull;
    }

    public final void a0(View view, boolean z) {
        this.G.add(view);
        this.H.add(Boolean.valueOf(z));
    }

    public final void b0(hm hmVar) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(hmVar)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            hm[] hmVarArr = (hm[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), hm.class);
            for (hm hmVar2 : hmVarArr) {
                hmVar2.setAnimateChanges();
            }
        }
    }

    public final boolean c0(boolean z) {
        boolean z2 = !this.I.keySet().equals(this.K.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.Y) {
            z2 = false;
        }
        if (this.M != this.a) {
            z2 = true;
        }
        if (z && z2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = ob6.M0(2131743490, "UnsavedChanges");
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131746134, "ReactionApplyChangesDialog");
            alertDialog$Builder.j(ob6.M0(2131754209, "ApplyTheme"), new fd(this) {
                public final t82 b;

                {
                    this.b = this;
                }

                @Override
                public final void w(id idVar2, int i) {
                    byte b = r2;
                    t82 t82Var = this.b;
                    switch (b) {
                        case 0:
                            t82Var.s.performClick();
                            return;
                        default:
                            t82Var.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.g(ob6.M0(2131751371, null), new fd(this) {
                public final t82 b;

                {
                    this.b = this;
                }

                @Override
                public final void w(id idVar2, int i) {
                    byte b = r2;
                    t82 t82Var = this.b;
                    switch (b) {
                        case 0:
                            t82Var.s.performClick();
                            return;
                        default:
                            t82Var.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z2;
    }

    @Override
    public final boolean canBeginSlide() {
        if (c0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t82.createView(android.content.Context):android.view.View");
    }

    public final void d0(boolean z) {
        if (this.X == null) {
            return;
        }
        if (this.Z == 0) {
            this.Z = 1;
        }
        int size = g0(true).size();
        this.Y = size;
        if (this.X.level < size) {
            if (z) {
                d31.b0(this).Q(2131623982, 36, hl.S2(ob6.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
            }
            this.s.setLvlRequiredState(this.Y);
            return;
        }
        this.s.g(null, true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null && wk5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0() {
        if (this.P) {
            this.P = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.F.setFocusableInTouchMode(true);
                this.F.requestFocus();
            } else {
                this.h.clearFocus();
            }
            jn7.e().k(jn7.j1, 512);
            this.c.setLayerType(2, null);
            this.R.a(false, true);
        }
    }

    public final boolean f0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        hm[] hmVarArr = (hm[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, hm.class);
        for (hm hmVar : hmVarArr) {
            this.I.remove(Long.valueOf(hmVar.documentId));
            this.J.remove(Long.valueOf(hmVar.documentId));
            this.b.A(Long.valueOf(hmVar.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        d0(false);
        return true;
    }

    public final ArrayList g0(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.J;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            Long l = (Long) obj;
            if (l.longValue() != -1) {
                ArrayList arrayList4 = this.L;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        Object obj2 = arrayList4.get(i2);
                        i2++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l.longValue() == tL_availableReaction.activate_animation.id) {
                            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                            tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                            arrayList.add(tL_reactionEmoji);
                            break;
                        }
                    } else {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                }
            }
        }
        if (z) {
            return arrayList2;
        }
        return arrayList;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.F;
    }

    public final void h0(int i, boolean z, boolean z2) {
        boolean z3;
        int i2;
        int i3;
        if (this.Z != i || this.a != z) {
            this.a = z;
            if (i != 1 && i != 0 && !z) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.e.setChecked(z3);
            if (z3) {
                i2 = aob.f6;
            } else {
                i2 = aob.e6;
            }
            int w0 = aob.w0(null, i2, false);
            wkb wkbVar = this.e;
            if (z2) {
                if (z3) {
                    wkbVar.b(w0, true);
                } else {
                    wkbVar.setBackgroundColorAnimatedReverse(w0);
                }
            } else {
                if (z3) {
                    i3 = aob.f6;
                } else {
                    i3 = aob.e6;
                }
                yob.h(i3, null, wkbVar);
            }
            this.Z = i;
            if (i != 1 && i != 0 && !z) {
                if (z2) {
                    e0();
                    this.w.animate().setListener(null).cancel();
                    this.w.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43.f).setListener(new jb1(this, (byte) 20)).start();
                    this.h.setFocusableInTouchMode(false);
                    this.F.g3.O(true);
                    return;
                }
                this.w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(false);
                return;
            }
            this.w.setVisibility(0);
            this.F.g3.O(z2);
            if (z2) {
                this.w.animate().setListener(null).cancel();
                this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(k43.f).start();
                this.F.post(new l82(this, (byte) 1));
                LinkedHashMap linkedHashMap = this.I;
                if (linkedHashMap.isEmpty()) {
                    this.b.L.clear();
                    this.h.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.L;
                    int size = arrayList.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size) {
                        int i6 = i5 + 1;
                        z49.a((TLRPC.TL_availableReaction) arrayList.get(i5), linkedHashMap, this.J, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                        i4++;
                        if (i4 >= this.O) {
                            break;
                        }
                        i5 = i6;
                    }
                    this.h.append(spannableStringBuilder);
                    this.h.J();
                    m0a m0aVar = this.b.q0;
                    if (m0aVar != null) {
                        m0aVar.f();
                    }
                    d0(false);
                }
            }
        }
    }

    public final void i0(float f) {
        float a = ete.a(f, 0.0f, 1.0f);
        zc zcVar = this.c;
        if (zcVar != null && this.w != null) {
            zcVar.setTranslationY((1.0f - a) * zcVar.getMeasuredHeight());
            this.w.setTranslationY((-a) * this.c.getMeasuredHeight());
        }
        k0();
        m0();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        wkb wkbVar = this.r;
        boolean z = wkbVar.e.h;
        int i = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z) {
            wkbVar.setChecked(false);
            arrayList.remove((Object) (-1L));
            hm hmVar = (hm) linkedHashMap.remove(-1L);
            if (hmVar != null) {
                hmVar.setRemoved(new dy1(this, hmVar, (byte) 22));
            }
            b0(hmVar);
            this.b.x(-1L, true);
            d0(false);
            this.h.setMaxLength(i);
            h0(this.Z, this.a, true);
        } else {
            wkbVar.setChecked(true);
            try {
                this.h.setMaxLength(i + 1);
                SpannableString spannableString = new SpannableString("b");
                s82 s82Var = new s82(this);
                s82Var.cacheType = wl.f();
                s82Var.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, s82Var);
                spannableString.setSpan(s82Var, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                d0(true);
                b0(s82Var);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            h0(this.Z, true, true);
        }
        this.h.k(true);
    }

    public final void k0() {
        float f;
        if (this.w != null && this.s != null) {
            fm0 fm0Var = this.R;
            if (fm0Var != null) {
                f = fm0Var.e;
            } else {
                f = 0.0f;
            }
            int round = Math.round((1.0f - f) * this.y);
            ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
            layoutParams.height = hl.L(74.0f) + round;
            this.w.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
            layoutParams2.bottomMargin = hl.L(13.0f) + round;
            this.s.setLayoutParams(layoutParams2);
        }
    }

    public final void l0() {
        if (this.c != null) {
            this.E.setColor(aob.v0(aob.d6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.y);
            this.c.invalidate();
        }
    }

    public final void m0() {
        float f;
        if (this.F == null) {
            return;
        }
        fm0 fm0Var = this.R;
        if (fm0Var != null) {
            f = fm0Var.e;
        } else {
            f = 0.0f;
        }
        int U1 = hl.U1(f, hl.L(72.0f), hl.L(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d));
        q9c q9cVar = this.F;
        mq5 mq5Var = this.mSystemInsets;
        eg0.g(q9cVar, mq5Var.b, mq5Var.d, a.getCurrentActionBarHeight(), U1);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.P) {
            if (z) {
                e0();
                return false;
            }
        } else if (!c0(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        uc7 messagesController = getMessagesController();
        long j = this.T;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        this.W = M0;
        if (M0 == null) {
            TLRPC.Chat O = jf7.Y(this.currentAccount).O(j);
            this.W = O;
            if (O != null) {
                getMessagesController().a4(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().G0().a(-j, new m82(this, (byte) 0));
            getNotificationCenter().b(this, jn7.Y4);
            this.L.addAll(getMediaDataController().n);
            jn7.e().k(jn7.j1, 512);
            getNotificationCenter().b(this, jn7.y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        hl.r(this.b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.a))) {
            getMessagesController().T4(this.T, this.Z, g0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, jn7.Y4);
        getNotificationCenter().n(this, jn7.y1);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.y = i4;
        k0();
        l0();
        m0();
    }

    @Override
    public final void onPause() {
        this.a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.a0) {
            this.a0 = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.P) {
                this.h.K(false);
                hl.d3(new l82(this, (byte) 0), 250L);
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i;
        try {
            super.onThemeColorsChanged();
            wkb wkbVar = this.e;
            if (wkbVar != null && (wkbVar.getBackground() instanceof ColorDrawable)) {
                wkb wkbVar2 = this.e;
                if (wkbVar2.e.h) {
                    i = aob.f6;
                } else {
                    i = aob.e6;
                }
                wkbVar2.setBackgroundColor(aob.w0(null, i, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z && this.Z != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z) {
            this.Q = true;
            if (!z2) {
                if (this.b == null) {
                    r82 r82Var = new r82(this, this, getParentActivity(), getResourceProvider(), aob.v0(aob.G6, getResourceProvider()));
                    this.b = r82Var;
                    r82Var.setAnimationsEnabled(false);
                    this.b.setClipChildren(false);
                    yob.h(aob.d6, null, this.b);
                    this.c.addView(this.b, tre.e(-1, -2, 80));
                    jd0 jd0Var = new jd0(getParentActivity(), getResourceProvider());
                    this.d = jd0Var;
                    jd0Var.setOnBackspace(new m82(this, (byte) 1));
                    this.c.addView(this.d, tre.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                    ArrayList arrayList = this.J;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        this.b.x((Long) obj, false);
                    }
                }
                hl.d3(new kc((byte) 22), 200L);
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
