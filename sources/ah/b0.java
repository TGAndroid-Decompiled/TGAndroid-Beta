package ah;

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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.i61;
import org.telegram.ui.yd;
import w7.x5;
public final class b0 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public final LinkedHashMap E;
    public final ArrayList F;
    public final LinkedHashMap G;
    public final ArrayList H;
    public boolean I;
    public final int J;
    public boolean K;
    public final TLRPC.ChatFull L;
    public final long M;
    public int N;
    public int O;
    public TLRPC.Chat P;
    public TL_stories.TL_premium_boostsStatus Q;
    public int R;
    public int S;
    public boolean T;
    public final l U;
    public boolean f455a;
    public z f456b;
    public y f457c;
    public i d;
    public w8 f458e;
    public LinearLayout f459f;
    public yd h;
    public x f460n;
    public z7 f461r;
    public w8 f462s;
    public n1 v;
    public FrameLayout f463w;
    public ImageView f464x;
    public zn0 f465y;

    public b0(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new LinkedHashMap();
        this.F = new ArrayList();
        this.G = new LinkedHashMap();
        this.H = new ArrayList();
        this.J = getMessagesController().boostsChannelLevelMax;
        this.K = false;
        this.S = -1;
        this.U = new l(this, 5);
        this.M = j3;
        this.L = chatFull;
    }

    public static boolean U(b0 b0Var) {
        return b0Var.inPreviewMode;
    }

    public static boolean V(b0 b0Var) {
        return b0Var.inBubbleMode;
    }

    public final void W(z5 z5Var) {
        Editable text = this.f460n.getText();
        Layout layout = this.f460n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(z5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            z5[] z5VarArr = (z5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), z5.class);
            for (z5 z5Var2 : z5VarArr) {
                z5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z10) {
        boolean z11 = true;
        boolean z12 = !this.E.keySet().equals(this.G.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Q;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.R) {
            z12 = false;
        }
        if (this.I == this.f455a) {
            z11 = z12;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f20225a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.f20225a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new a2(this) {
                public final b0 f612b;

                {
                    this.f612b = this;
                }

                @Override
                public final void g(b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f612b.v.performClick();
                            return;
                        default:
                            this.f612b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new a2(this) {
                public final b0 f612b;

                {
                    this.f612b = this;
                }

                @Override
                public final void g(b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f612b.v.performClick();
                            return;
                        default:
                            this.f612b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z11;
    }

    public final void Y(boolean z10) {
        if (this.Q == null) {
            return;
        }
        if (this.S == 0) {
            this.S = 1;
        }
        int size = b0(true).size();
        this.R = size;
        if (this.Q.level < size) {
            if (z10) {
                yc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
            }
            this.v.setLvlRequiredState(this.R);
            return;
        }
        this.v.f(null, true);
    }

    public final void Z() {
        if (this.K) {
            this.K = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.f459f.setFocusableInTouchMode(true);
                this.f459f.requestFocus();
            } else {
                this.f460n.clearFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f465y.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f465y.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.f457c.animate().setListener(null).cancel();
            this.f457c.animate().translationY(this.f457c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(pr.f29493f).setUpdateListener(new n(this, 1)).setListener(new r(this, 0)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.f460n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.f460n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f460n.getText());
        if (!this.f460n.hasSelection()) {
            return false;
        }
        z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, z5.class);
        for (z5 z5Var : z5VarArr) {
            this.E.remove(Long.valueOf(z5Var.documentId));
            this.F.remove(Long.valueOf(z5Var.documentId));
            this.f456b.A(Long.valueOf(z5Var.documentId));
        }
        this.f460n.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList b0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.F;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() != -1) {
                ArrayList arrayList4 = this.H;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList4.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l4.longValue() == tL_availableReaction.activate_animation.f19902id) {
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

    public final void c0(int i10, boolean z10, boolean z11) {
        boolean z12;
        int i11;
        if (this.S != i10 || this.f455a != z10) {
            this.f455a = z10;
            if (i10 != 1 && i10 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f458e.setChecked(z12);
            if (z12) {
                i11 = j6.f20727f6;
            } else {
                i11 = j6.f20710e6;
            }
            int w02 = j6.w0(null, i11, false);
            if (z11) {
                if (z12) {
                    this.f458e.b(w02, true);
                } else {
                    this.f458e.setBackgroundColorAnimatedReverse(w02);
                }
            } else {
                this.f458e.setBackgroundColor(w02);
            }
            this.S = i10;
            if (i10 != 1 && i10 != 0 && !z10) {
                if (z11) {
                    Z();
                    this.f463w.animate().setListener(null).cancel();
                    this.f459f.animate().setListener(null).cancel();
                    ViewPropertyAnimator duration = this.f463w.animate().alpha(0.0f).setDuration(350L);
                    pr prVar = pr.f29493f;
                    duration.setInterpolator(prVar).setListener(new r(this, 2)).start();
                    this.f459f.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).setListener(new r(this, 3)).start();
                    return;
                }
                this.f459f.setVisibility(4);
                this.f463w.setVisibility(4);
                return;
            }
            this.f459f.setVisibility(0);
            this.f463w.setVisibility(0);
            if (z11) {
                this.f463w.animate().setListener(null).cancel();
                this.f459f.animate().setListener(null).cancel();
                ViewPropertyAnimator duration2 = this.f459f.animate().alpha(1.0f).setDuration(350L);
                pr prVar2 = pr.f29493f;
                duration2.setInterpolator(prVar2).setListener(new r(this, 1)).start();
                this.f463w.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar2).start();
                LinkedHashMap linkedHashMap = this.E;
                if (linkedHashMap.isEmpty()) {
                    this.f456b.K.clear();
                    this.f460n.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.H;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        m1.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.F, spannableStringBuilder, this.f456b, this.f460n.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.J) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.f460n.append(spannableStringBuilder);
                    this.f460n.m();
                    i61 i61Var = this.f456b.f37688p0;
                    if (i61Var != null) {
                        i61Var.l();
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
        throw new UnsupportedOperationException("Method not decompiled: ah.b0.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        w8 w8Var = this.f462s;
        boolean z10 = w8Var.f23517e.h;
        int i10 = this.J;
        LinkedHashMap linkedHashMap = this.E;
        ArrayList arrayList = this.F;
        if (z10) {
            w8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            z5 z5Var = (z5) linkedHashMap.remove(-1L);
            if (z5Var != null) {
                z5Var.setRemoved(new a1.e(5, this, z5Var));
            }
            W(z5Var);
            this.f456b.x(-1L, true);
            Y(false);
            this.f460n.setMaxLength(i10);
            c0(this.S, this.f455a, true);
        } else {
            w8Var.setChecked(true);
            try {
                this.f460n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                s sVar = new s(this);
                sVar.cacheType = q5.g();
                sVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, sVar);
                spannableString.setSpan(sVar, 0, spannableString.length(), 33);
                this.f460n.getText().insert(0, spannableString);
                this.f456b.x(-1L, true);
                Y(true);
                W(sVar);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            c0(this.S, true, true);
        }
        this.f460n.updateAnimatedEmoji(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.M)) {
            d5 d5Var = this.parentLayout;
            if (d5Var != null && d5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.K) {
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
        long j3 = this.M;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        this.P = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j3);
            this.P = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.P, true);
            }
            return false;
        }
        if (this.L != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j3, new m(this, 0));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.H.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.U);
        if (this.S == 2 && this.O != this.N) {
            getMessagesController().setCustomChatReactions(this.M, this.S, b0(false), this.O, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onPause() {
        this.T = true;
        this.f460n.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.T) {
            this.T = false;
            this.f460n.setFocusable(true);
            this.f460n.setFocusableInTouchMode(true);
            if (this.K) {
                this.f460n.n(false);
                AndroidUtilities.runOnUIThread(new l(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.S != 2) {
            this.f460n.setFocusableInTouchMode(true);
        }
        if (z10 && !z11) {
            if (this.f456b == null) {
                z zVar = new z(this, this, getParentActivity(), getResourceProvider(), j6.v0(j6.G6, getResourceProvider()));
                this.f456b = zVar;
                zVar.setAnimationsEnabled(false);
                this.f456b.setClipChildren(false);
                this.f456b.setBackgroundColor(j6.w0(null, j6.f20690d6, false));
                this.f457c.addView(this.f456b, x5.e(-1, -2, 80));
                i iVar = new i(getParentActivity(), getResourceProvider());
                this.d = iVar;
                iVar.setOnBackspace(new o(this, 0));
                this.f457c.addView(this.d, x5.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.F;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f456b.x((Long) obj, false);
                }
            }
            AndroidUtilities.runOnUIThread(new j(0), 200L);
        }
    }
}
