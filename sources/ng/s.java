package ng;

import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import eg.s2;
import eg.s3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k7.c6;
import mh.m2;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.v51;
public final class s extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public final LinkedHashMap B;
    public final ArrayList C;
    public final LinkedHashMap D;
    public final ArrayList E;
    public boolean F;
    public final int G;
    public boolean H;
    public final TLRPC.ChatFull I;
    public final long J;
    public int K;
    public int L;
    public TLRPC.Chat M;
    public TL_stories.TL_premium_boostsStatus N;
    public int O;
    public int P;
    public boolean Q;
    public final h R;
    public boolean f16209a;
    public q f16210b;
    public s2 f16211c;
    public f d;
    public s8 f16212e;
    public LinearLayout f16213f;
    public s3 h;
    public p f16214n;
    public x7 f16215r;
    public s8 f16216s;
    public t0 v;
    public FrameLayout f16217w;
    public ImageView f16218x;
    public eo0 f16219y;

    public s(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.B = new LinkedHashMap();
        this.C = new ArrayList();
        this.D = new LinkedHashMap();
        this.E = new ArrayList();
        this.G = getMessagesController().boostsChannelLevelMax;
        this.H = false;
        this.P = -1;
        this.R = new h(this, 5);
        this.J = j10;
        this.I = chatFull;
    }

    public static boolean U(s sVar) {
        return sVar.inPreviewMode;
    }

    public static boolean V(s sVar) {
        return sVar.inBubbleMode;
    }

    public final void W(u5 u5Var) {
        Editable text = this.f16214n.getText();
        Layout layout = this.f16214n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(u5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            u5[] u5VarArr = (u5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), u5.class);
            for (u5 u5Var2 : u5VarArr) {
                u5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z4) {
        boolean z10 = true;
        boolean z11 = !this.B.keySet().equals(this.D.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.N;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.O) {
            z11 = false;
        }
        if (this.F == this.f16209a) {
            z10 = z11;
        }
        if (z4 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f21168a.O = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.f21168a.Q = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new c2(this) {
                public final s f16068b;

                {
                    this.f16068b = this;
                }

                @Override
                public final void j(d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f16068b.v.performClick();
                            return;
                        default:
                            this.f16068b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new c2(this) {
                public final s f16068b;

                {
                    this.f16068b = this;
                }

                @Override
                public final void j(d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f16068b.v.performClick();
                            return;
                        default:
                            this.f16068b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z10;
    }

    public final void Y(boolean z4) {
        if (this.N == null) {
            return;
        }
        if (this.P == 0) {
            this.P = 1;
        }
        int size = b0(true).size();
        this.O = size;
        if (this.N.level < size) {
            if (z4) {
                qc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
            }
            this.v.setLvlRequiredState(this.O);
            return;
        }
        this.v.f(null, true);
    }

    public final void Z() {
        if (this.H) {
            this.H = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.f16213f.setFocusableInTouchMode(true);
                this.f16213f.requestFocus();
            } else {
                this.f16214n.clearFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16219y.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f16219y.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.f16211c.animate().setListener(null).cancel();
            this.f16211c.animate().translationY(this.f16211c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(pr.f30168f).setUpdateListener(new j(this, 1)).setListener(new m(this, 0)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.f16214n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.f16214n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f16214n.getText());
        if (!this.f16214n.hasSelection()) {
            return false;
        }
        u5[] u5VarArr = (u5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, u5.class);
        for (u5 u5Var : u5VarArr) {
            this.B.remove(Long.valueOf(u5Var.documentId));
            this.C.remove(Long.valueOf(u5Var.documentId));
            this.f16210b.A(Long.valueOf(u5Var.documentId));
        }
        this.f16214n.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList b0(boolean z4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.C;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l10 = (Long) obj;
            if (l10.longValue() != -1) {
                ArrayList arrayList4 = this.E;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList4.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l10.longValue() == tL_availableReaction.activate_animation.f20851id) {
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
        if (z4) {
            return arrayList2;
        }
        return arrayList;
    }

    public final void c0(int i10, boolean z4, boolean z10) {
        boolean z11;
        int i11;
        if (this.P != i10 || this.f16209a != z4) {
            this.f16209a = z4;
            if (i10 != 1 && i10 != 0 && !z4) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f16212e.setChecked(z11);
            if (z11) {
                i11 = k6.f21698f6;
            } else {
                i11 = k6.e6;
            }
            int w02 = k6.w0(null, i11, false);
            if (z10) {
                if (z11) {
                    this.f16212e.b(w02, true);
                } else {
                    this.f16212e.setBackgroundColorAnimatedReverse(w02);
                }
            } else {
                this.f16212e.setBackgroundColor(w02);
            }
            this.P = i10;
            if (i10 != 1 && i10 != 0 && !z4) {
                if (z10) {
                    Z();
                    this.f16217w.animate().setListener(null).cancel();
                    this.f16213f.animate().setListener(null).cancel();
                    ViewPropertyAnimator duration = this.f16217w.animate().alpha(0.0f).setDuration(350L);
                    pr prVar = pr.f30168f;
                    duration.setInterpolator(prVar).setListener(new m(this, 2)).start();
                    this.f16213f.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).setListener(new m(this, 3)).start();
                    return;
                }
                this.f16213f.setVisibility(4);
                this.f16217w.setVisibility(4);
                return;
            }
            this.f16213f.setVisibility(0);
            this.f16217w.setVisibility(0);
            if (z10) {
                this.f16217w.animate().setListener(null).cancel();
                this.f16213f.animate().setListener(null).cancel();
                ViewPropertyAnimator duration2 = this.f16213f.animate().alpha(1.0f).setDuration(350L);
                pr prVar2 = pr.f30168f;
                duration2.setInterpolator(prVar2).setListener(new m(this, 1)).start();
                this.f16217w.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar2).start();
                LinkedHashMap linkedHashMap = this.B;
                if (linkedHashMap.isEmpty()) {
                    this.f16210b.H.clear();
                    this.f16214n.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.E;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        s0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.C, spannableStringBuilder, this.f16210b, this.f16214n.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.G) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.f16214n.append(spannableStringBuilder);
                    this.f16214n.m();
                    v51 v51Var = this.f16210b.m0;
                    if (v51Var != null) {
                        v51Var.l();
                    }
                    Y(false);
                }
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (X(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: ng.s.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        s8 s8Var = this.f16216s;
        boolean z4 = s8Var.f23755e.h;
        int i10 = this.G;
        LinkedHashMap linkedHashMap = this.B;
        ArrayList arrayList = this.C;
        if (z4) {
            s8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            u5 u5Var = (u5) linkedHashMap.remove(-1L);
            if (u5Var != null) {
                u5Var.setRemoved(new m2(16, this, u5Var));
            }
            W(u5Var);
            this.f16210b.x(-1L, true);
            Y(false);
            this.f16214n.setMaxLength(i10);
            c0(this.P, this.f16209a, true);
        } else {
            s8Var.setChecked(true);
            try {
                this.f16214n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = l5.g();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.f16214n.getText().insert(0, spannableString);
                this.f16210b.x(-1L, true);
                Y(true);
                W(nVar);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            c0(this.P, true, true);
        }
        this.f16214n.updateAnimatedEmoji(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.J)) {
            f5 f5Var = this.parentLayout;
            if (f5Var != null && f5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.H) {
            if (z4) {
                Z();
                return false;
            }
        } else if (!X(z4)) {
            return super.onBackPressed(z4);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.J;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        this.M = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
            this.M = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.M, true);
            }
            return false;
        }
        if (this.I != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j10, new i(this, 0));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.E.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.R);
        if (this.P == 2 && this.L != this.K) {
            getMessagesController().setCustomChatReactions(this.J, this.P, b0(false), this.L, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onPause() {
        this.Q = true;
        this.f16214n.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.Q) {
            this.Q = false;
            this.f16214n.setFocusable(true);
            this.f16214n.setFocusableInTouchMode(true);
            if (this.H) {
                this.f16214n.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && this.P != 2) {
            this.f16214n.setFocusableInTouchMode(true);
        }
        if (z4 && !z10) {
            if (this.f16210b == null) {
                q qVar = new q(this, this, getParentActivity(), getResourceProvider(), k6.v0(k6.G6, getResourceProvider()));
                this.f16210b = qVar;
                qVar.setAnimationsEnabled(false);
                this.f16210b.setClipChildren(false);
                this.f16210b.setBackgroundColor(k6.w0(null, k6.f21661d6, false));
                this.f16211c.addView(this.f16210b, c6.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new k(this, 0));
                this.f16211c.addView(this.d, c6.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.C;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f16210b.x((Long) obj, false);
                }
            }
            AndroidUtilities.runOnUIThread(new ag.f(14), 200L);
        }
    }
}
