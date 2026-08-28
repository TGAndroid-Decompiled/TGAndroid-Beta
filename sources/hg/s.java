package hg;

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
import fh.d2;
import g7.e6;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.t5;
import org.telegram.ui.a51;
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
    public boolean f10719a;
    public q f10720b;
    public d2 f10721c;
    public f d;
    public t8 f10722e;
    public LinearLayout f10723f;
    public gh.m h;
    public p f10724n;
    public x7 f10725r;
    public t8 f10726s;
    public u0 v;
    public FrameLayout f10727w;
    public ImageView f10728x;
    public in0 f10729y;

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

    public static boolean T(s sVar) {
        return sVar.inPreviewMode;
    }

    public static boolean U(s sVar) {
        return sVar.inBubbleMode;
    }

    public final void V(t5 t5Var) {
        Editable text = this.f10724n.getText();
        Layout layout = this.f10724n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(t5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            t5[] t5VarArr = (t5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), t5.class);
            for (t5 t5Var2 : t5VarArr) {
                t5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean W(boolean z10) {
        boolean z11 = true;
        boolean z12 = !this.A.keySet().equals(this.C.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.M;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.N) {
            z12 = false;
        }
        if (this.E == this.f10719a) {
            z11 = z12;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f22702a.N = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.f22702a.P = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new b2(this) {
                public final s f10602b;

                {
                    this.f10602b = this;
                }

                @Override
                public final void f(c2 c2Var, int i9) {
                    switch (r2) {
                        case 0:
                            this.f10602b.v.performClick();
                            return;
                        default:
                            this.f10602b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new b2(this) {
                public final s f10602b;

                {
                    this.f10602b = this;
                }

                @Override
                public final void f(c2 c2Var, int i9) {
                    switch (r2) {
                        case 0:
                            this.f10602b.v.performClick();
                            return;
                        default:
                            this.f10602b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z11;
    }

    public final void X(boolean z10) {
        if (this.M == null) {
            return;
        }
        if (this.O == 0) {
            this.O = 1;
        }
        int size = a0(true).size();
        this.N = size;
        if (this.M.level < size) {
            if (z10) {
                oc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
            }
            this.v.setLvlRequiredState(this.N);
            return;
        }
        this.v.f(null, true);
    }

    public final void Y() {
        if (this.G) {
            this.G = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.f10723f.setFocusableInTouchMode(true);
                this.f10723f.requestFocus();
            } else {
                this.f10724n.clearFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10729y.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f10729y.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.f10721c.animate().setListener(null).cancel();
            this.f10721c.animate().translationY(this.f10721c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(gr.f28844f).setUpdateListener(new j(this, 1)).setListener(new m(this, 0)).start();
        }
    }

    public final boolean Z() {
        int editTextSelectionEnd = this.f10724n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.f10724n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10724n.getText());
        if (!this.f10724n.hasSelection()) {
            return false;
        }
        t5[] t5VarArr = (t5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, t5.class);
        for (t5 t5Var : t5VarArr) {
            this.A.remove(Long.valueOf(t5Var.documentId));
            this.B.remove(Long.valueOf(t5Var.documentId));
            this.f10720b.A(Long.valueOf(t5Var.documentId));
        }
        this.f10724n.dispatchKeyEvent(new KeyEvent(0, 67));
        X(false);
        return true;
    }

    public final ArrayList a0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.B;
        int size = arrayList3.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList3.get(i9);
            i9++;
            Long l10 = (Long) obj;
            if (l10.longValue() != -1) {
                ArrayList arrayList4 = this.D;
                int size2 = arrayList4.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size2) {
                        Object obj2 = arrayList4.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l10.longValue() == tL_availableReaction.activate_animation.f22386id) {
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

    public final void b0(int i9, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.O != i9 || this.f10719a != z10) {
            this.f10719a = z10;
            if (i9 != 1 && i9 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f10722e.setChecked(z12);
            if (z12) {
                i10 = f6.f23037f6;
            } else {
                i10 = f6.f23019e6;
            }
            int w02 = f6.w0(null, i10, false);
            if (z11) {
                if (z12) {
                    this.f10722e.b(w02, true);
                } else {
                    this.f10722e.setBackgroundColorAnimatedReverse(w02);
                }
            } else {
                this.f10722e.setBackgroundColor(w02);
            }
            this.O = i9;
            if (i9 != 1 && i9 != 0 && !z10) {
                if (z11) {
                    Y();
                    this.f10727w.animate().setListener(null).cancel();
                    this.f10723f.animate().setListener(null).cancel();
                    ViewPropertyAnimator duration = this.f10727w.animate().alpha(0.0f).setDuration(350L);
                    gr grVar = gr.f28844f;
                    duration.setInterpolator(grVar).setListener(new m(this, 2)).start();
                    this.f10723f.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).setListener(new m(this, 3)).start();
                    return;
                }
                this.f10723f.setVisibility(4);
                this.f10727w.setVisibility(4);
                return;
            }
            this.f10723f.setVisibility(0);
            this.f10727w.setVisibility(0);
            if (z11) {
                this.f10727w.animate().setListener(null).cancel();
                this.f10723f.animate().setListener(null).cancel();
                ViewPropertyAnimator duration2 = this.f10723f.animate().alpha(1.0f).setDuration(350L);
                gr grVar2 = gr.f28844f;
                duration2.setInterpolator(grVar2).setListener(new m(this, 1)).start();
                this.f10727w.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar2).start();
                LinkedHashMap linkedHashMap = this.A;
                if (linkedHashMap.isEmpty()) {
                    this.f10720b.G.clear();
                    this.f10724n.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.D;
                    int size = arrayList.size();
                    int i11 = 0;
                    int i12 = 0;
                    while (i12 < size) {
                        int i13 = i12 + 1;
                        t0.a((TLRPC.TL_availableReaction) arrayList.get(i12), linkedHashMap, this.B, spannableStringBuilder, this.f10720b, this.f10724n.getFontMetricsInt());
                        i11++;
                        if (i11 >= this.F) {
                            break;
                        }
                        i12 = i13;
                    }
                    this.f10724n.append(spannableStringBuilder);
                    this.f10724n.m();
                    a51 a51Var = this.f10720b.f36687l0;
                    if (a51Var != null) {
                        a51Var.l();
                    }
                    X(false);
                }
            }
        }
    }

    public final void c0() {
        t8 t8Var = this.f10726s;
        boolean z10 = t8Var.f25711e.h;
        int i9 = this.F;
        LinkedHashMap linkedHashMap = this.A;
        ArrayList arrayList = this.B;
        if (z10) {
            t8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            t5 t5Var = (t5) linkedHashMap.remove(-1L);
            if (t5Var != null) {
                t5Var.setRemoved(new h3.g0(1, this, t5Var));
            }
            V(t5Var);
            this.f10720b.x(-1L, true);
            X(false);
            this.f10724n.setMaxLength(i9);
            b0(this.O, this.f10719a, true);
        } else {
            t8Var.setChecked(true);
            try {
                this.f10724n.setMaxLength(i9 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = k5.g();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.f10724n.getText().insert(0, spannableString);
                this.f10720b.x(-1L, true);
                X(true);
                V(nVar);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            b0(this.O, true, true);
        }
        this.f10724n.updateAnimatedEmoji(true);
    }

    @Override
    public final boolean canBeginSlide() {
        if (W(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: hg.s.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.I)) {
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
                Y();
                return false;
            }
        } else if (!W(z10)) {
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
            getMessagesController().setCustomChatReactions(this.I, this.O, a0(false), this.K, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onPause() {
        this.P = true;
        this.f10724n.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.P) {
            this.P = false;
            this.f10724n.setFocusable(true);
            this.f10724n.setFocusableInTouchMode(true);
            if (this.G) {
                this.f10724n.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.O != 2) {
            this.f10724n.setFocusableInTouchMode(true);
        }
        if (z10 && !z11) {
            if (this.f10720b == null) {
                q qVar = new q(this, this, getParentActivity(), getResourceProvider(), f6.v0(f6.G6, getResourceProvider()));
                this.f10720b = qVar;
                qVar.setAnimationsEnabled(false);
                this.f10720b.setClipChildren(false);
                this.f10720b.setBackgroundColor(f6.w0(null, f6.f23001d6, false));
                this.f10721c.addView(this.f10720b, e6.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new k(this, 0));
                this.f10721c.addView(this.d, e6.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.B;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    this.f10720b.x((Long) obj, false);
                }
            }
            AndroidUtilities.runOnUIThread(new bg.d2(7), 200L);
        }
    }
}
