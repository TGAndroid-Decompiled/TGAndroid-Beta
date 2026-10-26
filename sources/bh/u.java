package bh;

import a8.ee;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.c8;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.b51;
public final class u extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public r71 E;
    public final ArrayList F;
    public final ArrayList G;
    public final LinkedHashMap H;
    public final ArrayList I;
    public final LinkedHashMap J;
    public final ArrayList K;
    public boolean L;
    public final int M;
    public boolean N;
    public boolean O;
    public oe.b P;
    public final TLRPC.ChatFull Q;
    public final long R;
    public int S;
    public int T;
    public TLRPC.Chat U;
    public TL_stories.TL_premium_boostsStatus V;
    public int W;
    public int X;
    public boolean Y;
    public final j Z;
    public boolean f4149a;
    public s f4150b;
    public r f4151c;
    public h d;
    public a9 e;
    public i9 f4152f;
    public q h;
    public c8 f4153n;
    public a9 f4154r;
    public b1 f4155s;
    public FrameLayout v;
    public ImageView f4156w;
    public int f4157x;
    public final Paint f4158y;

    public u(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.f4158y = new Paint();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new LinkedHashMap();
        this.I = new ArrayList();
        this.J = new LinkedHashMap();
        this.K = new ArrayList();
        this.M = getMessagesController().boostsChannelLevelMax;
        this.N = false;
        this.X = -1;
        this.Z = new j(this, 6);
        this.R = j10;
        this.Q = chatFull;
    }

    public static boolean V(u uVar) {
        return uVar.inPreviewMode;
    }

    public static boolean W(u uVar) {
        return uVar.inBubbleMode;
    }

    public final void X(View view, boolean z10) {
        this.F.add(view);
        this.G.add(Boolean.valueOf(z10));
    }

    public final void Y(c6 c6Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(c6Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            c6[] c6VarArr = (c6[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), c6.class);
            for (c6 c6Var2 : c6VarArr) {
                c6Var2.setAnimateChanges();
            }
        }
    }

    public final boolean Z(boolean z10) {
        boolean z11 = true;
        boolean z12 = !this.H.keySet().equals(this.J.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.W) {
            z12 = false;
        }
        if (this.L == this.f4149a) {
            z11 = z12;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f22368a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.f22368a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new b2(this) {
                public final u f4046b;

                {
                    this.f4046b = this;
                }

                @Override
                public final void h(e2 e2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f4046b.f4155s.performClick();
                            return;
                        default:
                            this.f4046b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new b2(this) {
                public final u f4046b;

                {
                    this.f4046b = this;
                }

                @Override
                public final void h(e2 e2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f4046b.f4155s.performClick();
                            return;
                        default:
                            this.f4046b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
        }
        return z11;
    }

    public final void a0(boolean z10) {
        if (this.V == null) {
            return;
        }
        if (this.X == 0) {
            this.X = 1;
        }
        int size = d0(true).size();
        this.W = size;
        if (this.V.level < size) {
            if (z10) {
                wc.b0(this).R(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
            }
            this.f4155s.setLvlRequiredState(this.W);
            return;
        }
        this.f4155s.g(null, true);
    }

    public final void b0() {
        if (this.N) {
            this.N = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.E.setFocusableInTouchMode(true);
                this.E.requestFocus();
            } else {
                this.h.clearFocus();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.f4151c.setLayerType(2, null);
            this.P.a(false, true);
        }
    }

    public final boolean c0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        c6[] c6VarArr = (c6[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, c6.class);
        for (c6 c6Var : c6VarArr) {
            this.H.remove(Long.valueOf(c6Var.documentId));
            this.I.remove(Long.valueOf(c6Var.documentId));
            this.f4150b.A(Long.valueOf(c6Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        a0(false);
        return true;
    }

    @Override
    public final boolean canBeginSlide() {
        if (Z(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: bh.u.createView(android.content.Context):android.view.View");
    }

    public final ArrayList d0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.I;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() != -1) {
                ArrayList arrayList4 = this.K;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList4.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l4.longValue() == tL_availableReaction.activate_animation.f22033id) {
                            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                            tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                            arrayList.add(tL_reactionEmoji);
                            break;
                        }
                    } else {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l4.longValue();
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

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.R)) {
            j5 j5Var = this.parentLayout;
            if (j5Var != null && j5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(int i10, boolean z10, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        if (this.X != i10 || this.f4149a != z10) {
            this.f4149a = z10;
            if (i10 != 1 && i10 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.e.setChecked(z12);
            if (z12) {
                i11 = y6.f23393f6;
            } else {
                i11 = y6.f23375e6;
            }
            int x02 = y6.x0(null, i11, false);
            if (z11) {
                if (z12) {
                    this.e.b(x02, true);
                } else {
                    this.e.setBackgroundColorAnimatedReverse(x02);
                }
            } else {
                a9 a9Var = this.e;
                if (z12) {
                    i12 = y6.f23393f6;
                } else {
                    i12 = y6.f23375e6;
                }
                f7.i(i12, a9Var, null);
            }
            this.X = i10;
            if (i10 != 1 && i10 != 0 && !z10) {
                if (z11) {
                    b0();
                    this.v.animate().setListener(null).cancel();
                    this.v.animate().alpha(0.0f).setDuration(350L).setInterpolator(ds.f27586f).setListener(new b(this, 1)).start();
                    this.h.setFocusableInTouchMode(false);
                    this.E.f32152g3.O(true);
                    return;
                }
                this.v.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.E.f32152g3.O(false);
                return;
            }
            this.v.setVisibility(0);
            this.E.f32152g3.O(z11);
            if (z11) {
                this.v.animate().setListener(null).cancel();
                this.v.animate().alpha(1.0f).setDuration(350L).setInterpolator(ds.f27586f).start();
                this.E.post(new j(this, 1));
                LinkedHashMap linkedHashMap = this.H;
                if (linkedHashMap.isEmpty()) {
                    this.f4150b.K.clear();
                    this.h.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.K;
                    int size = arrayList.size();
                    int i13 = 0;
                    int i14 = 0;
                    while (i14 < size) {
                        int i15 = i14 + 1;
                        a1.a((TLRPC.TL_availableReaction) arrayList.get(i14), linkedHashMap, this.I, spannableStringBuilder, this.f4150b, this.h.getFontMetricsInt());
                        i13++;
                        if (i13 >= this.M) {
                            break;
                        }
                        i14 = i15;
                    }
                    this.h.append(spannableStringBuilder);
                    this.h.m();
                    b51 b51Var = this.f4150b.f38314p0;
                    if (b51Var != null) {
                        b51Var.l();
                    }
                    a0(false);
                }
            }
        }
    }

    public final void f0(float f7) {
        float a2 = ee.a(f7, 0.0f, 1.0f);
        r rVar = this.f4151c;
        if (rVar != null && this.v != null) {
            rVar.setTranslationY((1.0f - a2) * rVar.getMeasuredHeight());
            this.v.setTranslationY((-a2) * this.f4151c.getMeasuredHeight());
        }
        h0();
        j0();
    }

    public final void g0() {
        a9 a9Var = this.f4154r;
        boolean z10 = a9Var.e.h;
        int i10 = this.M;
        LinkedHashMap linkedHashMap = this.H;
        ArrayList arrayList = this.I;
        if (z10) {
            a9Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            c6 c6Var = (c6) linkedHashMap.remove(-1L);
            if (c6Var != null) {
                c6Var.setRemoved(new a1.f(21, this, c6Var));
            }
            Y(c6Var);
            this.f4150b.x(-1L, true);
            a0(false);
            this.h.setMaxLength(i10);
            e0(this.X, this.f4149a, true);
        } else {
            a9Var.setChecked(true);
            try {
                this.h.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                t tVar = new t(this);
                tVar.cacheType = t5.g();
                tVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, tVar);
                spannableString.setSpan(tVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.f4150b.x(-1L, true);
                a0(true);
                Y(tVar);
            } catch (Exception e) {
                FileLog.e(e);
            }
            e0(this.X, true, true);
        }
        this.h.updateAnimatedEmoji(true);
    }

    @Override
    public final mm0 getListViewForSimpleGlass() {
        return this.E;
    }

    public final void h0() {
        float f7;
        if (this.v != null && this.f4155s != null) {
            oe.b bVar = this.P;
            if (bVar != null) {
                f7 = bVar.e;
            } else {
                f7 = 0.0f;
            }
            int round = Math.round((1.0f - f7) * this.f4157x);
            ViewGroup.LayoutParams layoutParams = this.v.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(74.0f) + round;
            this.v.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f4155s.getLayoutParams();
            layoutParams2.bottomMargin = AndroidUtilities.dp(13.0f) + round;
            this.f4155s.setLayoutParams(layoutParams2);
        }
    }

    public final void i0() {
        if (this.f4151c != null) {
            this.f4158y.setColor(y6.w0(y6.f23356d6, this.resourceProvider));
            this.f4151c.setPadding(0, 0, 0, this.f4157x);
            this.f4151c.invalidate();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        float f7;
        if (this.E == null) {
            return;
        }
        oe.b bVar = this.P;
        if (bVar != null) {
            f7 = bVar.e;
        } else {
            f7 = 0.0f;
        }
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(12.0f) + Math.max(0, this.f4151c.getMeasuredHeight() - this.mSystemInsets.d), f7);
        r71 r71Var = this.E;
        i0.b bVar2 = this.mSystemInsets;
        oi.a.d(r71Var, bVar2.f13451b, bVar2.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), lerp);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.N) {
            if (z10) {
                b0();
                return false;
            }
        } else if (!Z(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.R;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        this.U = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
            this.U = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.U, true);
            }
            return false;
        }
        if (this.Q != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j10, new k(this, 0));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.K.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.Z);
        if (this.X == 2 && this.T != this.S) {
            getMessagesController().setCustomChatReactions(this.R, this.X, d0(false), this.T, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f4157x = i13;
        h0();
        i0();
        j0();
    }

    @Override
    public final void onPause() {
        this.Y = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.Y) {
            this.Y = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.N) {
                this.h.n(false);
                AndroidUtilities.runOnUIThread(new j(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            a9 a9Var = this.e;
            if (a9Var != null && (a9Var.getBackground() instanceof ColorDrawable)) {
                a9 a9Var2 = this.e;
                if (a9Var2.e.h) {
                    i10 = y6.f23393f6;
                } else {
                    i10 = y6.f23375e6;
                }
                a9Var2.setBackgroundColor(y6.x0(null, i10, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.X != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z10) {
            this.O = true;
        }
        if (z10 && !z11) {
            if (this.f4150b == null) {
                s sVar = new s(this, this, getParentActivity(), getResourceProvider(), y6.w0(y6.G6, getResourceProvider()));
                this.f4150b = sVar;
                sVar.setAnimationsEnabled(false);
                this.f4150b.setClipChildren(false);
                f7.i(y6.f23356d6, this.f4150b, null);
                this.f4151c.addView(this.f4150b, gb1.i(-1, -2, 80));
                h hVar = new h(getParentActivity(), getResourceProvider());
                this.d = hVar;
                hVar.setOnBackspace(new k(this, 1));
                this.f4151c.addView(this.d, gb1.h(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f4150b.x((Long) obj, false);
                }
            }
            AndroidUtilities.runOnUIThread(new ag.c(2), 200L);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
