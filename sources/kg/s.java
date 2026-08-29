package kg;

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
import bg.x2;
import bg.y3;
import i7.f6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jh.w2;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.c51;
public final class s extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public final LinkedHashMap A;
    public final ArrayList B;
    public final LinkedHashMap C;
    public final ArrayList D;
    public boolean E;
    public final int F;
    public boolean G;
    public final TLRPC.ChatFull H;
    public final long I;
    public int J;
    public int K;
    public TLRPC.Chat L;
    public TL_stories.TL_premium_boostsStatus M;
    public int N;
    public int O;
    public boolean P;
    public final h Q;
    public boolean f13854a;
    public q f13855b;
    public x2 f13856c;
    public f d;
    public q8 f13857e;
    public LinearLayout f13858f;
    public y3 h;
    public p f13859n;
    public v7 f13860r;
    public q8 f13861s;
    public t0 v;
    public FrameLayout f13862w;
    public ImageView f13863x;
    public un0 f13864y;

    public s(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.A = new LinkedHashMap();
        this.B = new ArrayList();
        this.C = new LinkedHashMap();
        this.D = new ArrayList();
        this.F = getMessagesController().boostsChannelLevelMax;
        this.G = false;
        this.O = -1;
        this.Q = new h(this, 5);
        this.I = j10;
        this.H = chatFull;
    }

    public static boolean U(s sVar) {
        return sVar.inPreviewMode;
    }

    public static boolean V(s sVar) {
        return sVar.inBubbleMode;
    }

    public final void W(y5 y5Var) {
        Editable text = this.f13859n.getText();
        Layout layout = this.f13859n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(y5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            y5[] y5VarArr = (y5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), y5.class);
            for (y5 y5Var2 : y5VarArr) {
                y5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z10) {
        boolean z11 = true;
        boolean z12 = !this.A.keySet().equals(this.C.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.M;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.N) {
            z12 = false;
        }
        if (this.E == this.f13854a) {
            z11 = z12;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f22714a.N = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.f22714a.P = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new b2(this) {
                public final s f13714b;

                {
                    this.f13714b = this;
                }

                @Override
                public final void g(c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f13714b.v.performClick();
                            return;
                        default:
                            this.f13714b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new b2(this) {
                public final s f13714b;

                {
                    this.f13714b = this;
                }

                @Override
                public final void g(c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f13714b.v.performClick();
                            return;
                        default:
                            this.f13714b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z11;
    }

    public final void Y(boolean z10) {
        if (this.M == null) {
            return;
        }
        if (this.O == 0) {
            this.O = 1;
        }
        int size = b0(true).size();
        this.N = size;
        if (this.M.level < size) {
            if (z10) {
                tc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
            }
            this.v.setLvlRequiredState(this.N);
            return;
        }
        this.v.f(null, true);
    }

    public final void Z() {
        if (this.G) {
            this.G = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.f13858f.setFocusableInTouchMode(true);
                this.f13858f.requestFocus();
            } else {
                this.f13859n.clearFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13864y.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f13864y.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.f13856c.animate().setListener(null).cancel();
            this.f13856c.animate().translationY(this.f13856c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(jr.f29800f).setUpdateListener(new j(this, 1)).setListener(new m(this, 0)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.f13859n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.f13859n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13859n.getText());
        if (!this.f13859n.hasSelection()) {
            return false;
        }
        y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, y5.class);
        for (y5 y5Var : y5VarArr) {
            this.A.remove(Long.valueOf(y5Var.documentId));
            this.B.remove(Long.valueOf(y5Var.documentId));
            this.f13855b.A(Long.valueOf(y5Var.documentId));
        }
        this.f13859n.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList b0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.B;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l10 = (Long) obj;
            if (l10.longValue() != -1) {
                ArrayList arrayList4 = this.D;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList4.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l10.longValue() == tL_availableReaction.activate_animation.f22398id) {
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

    public final void c0(int i10, boolean z10, boolean z11) {
        boolean z12;
        int i11;
        if (this.O != i10 || this.f13854a != z10) {
            this.f13854a = z10;
            if (i10 != 1 && i10 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f13857e.setChecked(z12);
            if (z12) {
                i11 = g6.f23099f6;
            } else {
                i11 = g6.f23080e6;
            }
            int w02 = g6.w0(null, i11, false);
            if (z11) {
                if (z12) {
                    this.f13857e.b(w02, true);
                } else {
                    this.f13857e.setBackgroundColorAnimatedReverse(w02);
                }
            } else {
                this.f13857e.setBackgroundColor(w02);
            }
            this.O = i10;
            if (i10 != 1 && i10 != 0 && !z10) {
                if (z11) {
                    Z();
                    this.f13862w.animate().setListener(null).cancel();
                    this.f13858f.animate().setListener(null).cancel();
                    ViewPropertyAnimator duration = this.f13862w.animate().alpha(0.0f).setDuration(350L);
                    jr jrVar = jr.f29800f;
                    duration.setInterpolator(jrVar).setListener(new m(this, 2)).start();
                    this.f13858f.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).setListener(new m(this, 3)).start();
                    return;
                }
                this.f13858f.setVisibility(4);
                this.f13862w.setVisibility(4);
                return;
            }
            this.f13858f.setVisibility(0);
            this.f13862w.setVisibility(0);
            if (z11) {
                this.f13862w.animate().setListener(null).cancel();
                this.f13858f.animate().setListener(null).cancel();
                ViewPropertyAnimator duration2 = this.f13858f.animate().alpha(1.0f).setDuration(350L);
                jr jrVar2 = jr.f29800f;
                duration2.setInterpolator(jrVar2).setListener(new m(this, 1)).start();
                this.f13862w.animate().alpha(1.0f).setDuration(350L).setInterpolator(jrVar2).start();
                LinkedHashMap linkedHashMap = this.A;
                if (linkedHashMap.isEmpty()) {
                    this.f13855b.G.clear();
                    this.f13859n.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.D;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        s0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.B, spannableStringBuilder, this.f13855b, this.f13859n.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.F) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.f13859n.append(spannableStringBuilder);
                    this.f13859n.m();
                    c51 c51Var = this.f13855b.f37344l0;
                    if (c51Var != null) {
                        c51Var.l();
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
        throw new UnsupportedOperationException("Method not decompiled: kg.s.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        q8 q8Var = this.f13861s;
        boolean z10 = q8Var.f25083e.h;
        int i10 = this.F;
        LinkedHashMap linkedHashMap = this.A;
        ArrayList arrayList = this.B;
        if (z10) {
            q8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            y5 y5Var = (y5) linkedHashMap.remove(-1L);
            if (y5Var != null) {
                y5Var.setRemoved(new w2(14, this, y5Var));
            }
            W(y5Var);
            this.f13855b.x(-1L, true);
            Y(false);
            this.f13859n.setMaxLength(i10);
            c0(this.O, this.f13854a, true);
        } else {
            q8Var.setChecked(true);
            try {
                this.f13859n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = p5.g();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.f13859n.getText().insert(0, spannableString);
                this.f13855b.x(-1L, true);
                Y(true);
                W(nVar);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            c0(this.O, true, true);
        }
        this.f13859n.updateAnimatedEmoji(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.I)) {
            b5 b5Var = this.parentLayout;
            if (b5Var != null && b5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.G) {
            if (z10) {
                Z();
                return false;
            }
        } else if (!X(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.I;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        this.L = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
            this.L = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.L, true);
            }
            return false;
        }
        if (this.H != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j10, new i(this, 0));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.D.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        if (this.O == 2 && this.K != this.J) {
            getMessagesController().setCustomChatReactions(this.I, this.O, b0(false), this.K, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onPause() {
        this.P = true;
        this.f13859n.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.P) {
            this.P = false;
            this.f13859n.setFocusable(true);
            this.f13859n.setFocusableInTouchMode(true);
            if (this.G) {
                this.f13859n.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.O != 2) {
            this.f13859n.setFocusableInTouchMode(true);
        }
        if (z10 && !z11) {
            if (this.f13855b == null) {
                q qVar = new q(this, this, getParentActivity(), getResourceProvider(), g6.v0(g6.G6, getResourceProvider()));
                this.f13855b = qVar;
                qVar.setAnimationsEnabled(false);
                this.f13855b.setClipChildren(false);
                this.f13855b.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
                this.f13856c.addView(this.f13855b, f6.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new k(this, 0));
                this.f13856c.addView(this.d, f6.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.B;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f13855b.x((Long) obj, false);
                }
            }
            AndroidUtilities.runOnUIThread(new ag.o0(12), 200L);
        }
    }
}
