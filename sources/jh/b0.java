package jh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a31;
import org.telegram.ui.ft;
import org.telegram.ui.gy;
import org.telegram.ui.ht;
import org.telegram.ui.kt;
import org.telegram.ui.lt0;
import org.telegram.ui.nc1;
import org.telegram.ui.pk;
import org.telegram.ui.qk0;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;
import org.telegram.ui.ta1;
import org.telegram.ui.we1;

public final class b0 implements View.OnClickListener {

    public final int f13070a;

    public final Object f13071b;

    public final Object f13072c;
    public final Object d;

    public final Object f13073e;

    public final Object f13074f;

    public b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f13070a = i10;
        this.f13071b = obj;
        this.f13072c = obj2;
        this.d = obj3;
        this.f13073e = obj4;
        this.f13074f = obj5;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        long j10;
        boolean z10;
        TLRPC.Chat chat;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.User user;
        Long lValueOf;
        Long lValueOf2;
        int i10 = 3;
        SpannableStringBuilder spannableStringBuilder = null;
        boolean zRelease = false;
        boolean zRelease2 = false;
        int i11 = 1;
        switch (this.f13070a) {
            case 0:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f13071b;
                org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) this.f13072c;
                org.telegram.ui.Cells.y1 y1Var3 = (org.telegram.ui.Cells.y1) this.d;
                z zVar = (z) this.f13073e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f13074f;
                zVar.run(Boolean.valueOf(y1Var.b()), Boolean.valueOf(y1Var2.b()), Boolean.valueOf(y1Var3.b()));
                e3Var.dismiss();
                break;
            case 1:
                e4 e4Var = (e4) this.f13071b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f13072c;
                i9 i9Var = (i9) this.d;
                Context context = (Context) this.f13073e;
                b4 b4Var = (b4) this.f13074f;
                c4 c4Var = e4Var.K1;
                ((z8) e4Var.M1).g(true);
                e4Var.f13258o1 = null;
                boolean[] zArr = {false};
                if (e4Var.f13295y1) {
                    s6 storiesController = MessagesController.getInstance(e4Var.f13296y2).getStoriesController();
                    j10 = 0;
                    if (storiesController.Q == 0) {
                        storiesController.P();
                    }
                    MessagesController.getInstance(e4Var.f13296y2).getStoriesController().R();
                    lh.a1 a1Var = MessagesController.getInstance(e4Var.f13296y2).getStoriesController().f13974w;
                    if (!a1Var.f15626c && !a1Var.d) {
                        a1Var.d = true;
                        lh.x0 x0Var = new lh.x0(a1Var, i11);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.f15624a);
                        messagesStorage.getStorageQueue().postRunnable(new hh.t5(messagesStorage, zRelease, x0Var, i10));
                    }
                } else {
                    j10 = 0;
                }
                if (e4Var.f13295y1) {
                    z10 = true;
                } else {
                    s6 storiesController2 = MessagesController.getInstance(e4Var.f13296y2).getStoriesController();
                    TL_stories.StoryItem storyItem = c4Var.f13141a;
                    int i12 = storiesController2.f13955a;
                    if (storyItem == null || storyItem.dialogId == UserConfig.getInstance(i12).getClientUserId() || ((storyItem.dialogId <= j10 || (user = MessagesController.getInstance(i12).getUser(Long.valueOf(storyItem.dialogId))) == null || !user.bot || !user.bot_can_edit) && (storyItem.dialogId >= j10 || (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-storyItem.dialogId))) == null || (!chat.creator && (!((z11 = storyItem.out) && (tL_chatAdminRights2 = chat.admin_rights) != null && (tL_chatAdminRights2.post_stories || tL_chatAdminRights2.edit_stories)) && (z11 || (tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.edit_stories)))))) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                x3 x3Var = new x3(e4Var, e4Var.getContext(), c6Var, c6Var, i9Var, c4Var.f13144e, e4Var.f13295y1 || ((e4Var.f13299z1 || e4Var.I0()) && z10), z10, context, b4Var, zArr);
                e4Var.f13261p1 = x3Var;
                ImageView imageView = e4Var.f13270s0;
                int iDp = AndroidUtilities.dp(6.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                x3Var.f30454b = true;
                x3Var.f30453a.showAsDropDown(imageView, 0, iDp);
                break;
            case 2:
                x3 x3Var2 = (x3) this.f13071b;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.f13072c;
                Context context2 = (Context) this.d;
                i9 i9Var2 = (i9) this.f13073e;
                b4 b4Var2 = (b4) this.f13074f;
                e4 e4Var2 = x3Var2.f14128l;
                if (view.getAlpha() < 1.0f) {
                    int i13 = -e4Var2.f13255n1;
                    e4Var2.f13255n1 = i13;
                    AndroidUtilities.shakeViewSpring(view, i13);
                    new mc(e4Var2.Y0, c6Var2).t("Wait until current upload is complete", null).j();
                    break;
                } else {
                    Activity activityFindActivity = AndroidUtilities.findActivity(context2);
                    if (activityFindActivity != null) {
                        x3Var2.f14121c = true;
                        x3 x3Var3 = e4Var2.f13261p1;
                        if (x3Var3 != null) {
                            x3Var3.a();
                        }
                        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(x3Var2, activityFindActivity, i9Var2, b4Var2, 12);
                        i9 i9Var3 = ((z8) e4Var2.M1).d;
                        h9 h9Var = i9Var3.f13510v0;
                        if (h9Var != null) {
                            zRelease = h9Var.release(bVar);
                            i9Var3.f13510v0 = null;
                        }
                        if (!zRelease) {
                            bVar.run();
                        }
                        break;
                    }
                }
                break;
            case 3:
                x3 x3Var4 = (x3) this.f13071b;
                Context context3 = (Context) this.f13072c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                i9 i9Var4 = (i9) this.f13073e;
                b4 b4Var3 = (b4) this.f13074f;
                e4 e4Var3 = x3Var4.f14128l;
                File fileH = e4Var3.K1.h();
                if (fileH == null || !fileH.exists()) {
                    e4Var3.a1();
                    break;
                } else {
                    Activity activityFindActivity2 = AndroidUtilities.findActivity(context3);
                    if (activityFindActivity2 != null) {
                        x3Var4.f14121c = true;
                        x3 x3Var5 = e4Var3.f13261p1;
                        if (x3Var5 != null) {
                            x3Var5.a();
                        }
                        cg.k0 k0Var = new cg.k0(x3Var4, activityFindActivity2, storyItem2, i9Var4, b4Var3, 15);
                        i9 i9Var5 = ((z8) e4Var3.M1).d;
                        h9 h9Var2 = i9Var5.f13510v0;
                        if (h9Var2 != null) {
                            zRelease2 = h9Var2.release(k0Var);
                            i9Var5.f13510v0 = null;
                        }
                        if (!zRelease2) {
                            k0Var.run();
                        }
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.e7 e7Var = (org.telegram.ui.e7) this.f13071b;
                org.telegram.ui.m7 m7Var = (org.telegram.ui.m7) this.f13072c;
                org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) this.d;
                zk0 zk0Var = (zk0) this.f13073e;
                org.telegram.ui.s7.a(e7Var.d, m7Var, (org.telegram.ui.o7) f7Var, zk0Var);
                org.telegram.ui.ActionBar.n1 n1Var = e7Var.f37641a;
                if (n1Var != null) {
                    n1Var.d(true);
                }
                break;
            case 5:
                new org.telegram.ui.b9((Context) this.f13071b, (String) this.f13072c, ((String[]) this.d)[0], (org.telegram.ui.ActionBar.c6) this.f13073e, (org.telegram.ui.ActionBar.e3) this.f13074f).show();
                break;
            case 6:
                rn rnVar = (rn) this.f13071b;
                String str = (String) this.f13072c;
                String str2 = (String) this.d;
                CharSequence charSequence = (CharSequence) this.f13073e;
                org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) this.f13074f;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(rnVar.getParentActivity(), null);
                Drawable drawableMutate = rnVar.getParentActivity().getDrawable(R.drawable.popup_fixed_alert4).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8), PorterDuff.Mode.MULTIPLY));
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(drawableMutate);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(rnVar.getParentActivity(), true, true);
                f1Var.g(LocaleController.getString(R.string.TranslateMessage), R.drawable.msg_translate, null);
                f1Var.setOnClickListener(new b0(rnVar, str, str2, charSequence, runnableArr, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                Runnable[] runnableArr = {new lt0(n1Var2, 27)};
                n1Var2.f23684e = true;
                n1Var2.f23683c = 220;
                n1Var2.setOutsideTouchable(true);
                n1Var2.setClippingEnabled(true);
                n1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                n1Var2.setFocusable(true);
                n1Var2.showAsDropDown(h0Var, (h0Var.getWidth() / 2) - AndroidUtilities.dp(90.0f), AndroidUtilities.dp(-16.0f), 83);
                break;
            case 7:
                rn rnVar2 = (rn) this.f13071b;
                String str3 = (String) this.f13072c;
                String str4 = (String) this.d;
                CharSequence charSequence2 = (CharSequence) this.f13073e;
                Runnable[] runnableArr2 = (Runnable[]) this.f13074f;
                b31.K(rnVar2.getParentActivity(), rnVar2, str3, str4, charSequence2, null, null);
                Runnable runnable = runnableArr2[0];
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f13071b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f13072c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f13073e;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f13074f;
                if (n2Var.getParentActivity() != null) {
                    if (editTextBoldCursor.length() == 0) {
                        Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(editTextBoldCursor);
                    } else {
                        if (n2Var instanceof nc1) {
                            org.telegram.ui.ActionBar.g6.o();
                            n2Var.finishFragment();
                        }
                        if (e6Var != null) {
                            f6Var.u(e6Var.f22883a);
                            org.telegram.ui.ActionBar.g6.n1(false, false);
                            Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.o0(editTextBoldCursor, b2Var, n2Var, zRelease ? 1 : 0));
                        } else {
                            org.telegram.ui.Components.y4.e0(editTextBoldCursor, b2Var, n2Var);
                        }
                    }
                    break;
                }
                break;
            case 9:
                AtomicReference atomicReference = (AtomicReference) this.f13071b;
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.f13072c;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f13073e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f13074f;
                if (atomicReference.get() != null) {
                    ((org.telegram.ui.ActionBar.n1) atomicReference.getAndSet(null)).dismiss();
                }
                if (e9Var.f27985b >= 0) {
                    if (b5Var.getFragmentStack() == null || e9Var.f27985b >= b5Var.getFragmentStack().size()) {
                        lValueOf = null;
                        lValueOf2 = null;
                    } else {
                        org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) b5Var.getFragmentStack().get(e9Var.f27985b);
                        if (n2Var3 instanceof rn) {
                            rn rnVar3 = (rn) n2Var3;
                            lValueOf2 = Long.valueOf(rnVar3.a());
                            lValueOf = Long.valueOf(rnVar3.b());
                        } else if (n2Var3 instanceof ProfileActivity) {
                            ProfileActivity profileActivity = (ProfileActivity) n2Var3;
                            lValueOf2 = Long.valueOf(profileActivity.a());
                            lValueOf = Long.valueOf(profileActivity.f35937c1);
                        } else {
                            lValueOf = null;
                            lValueOf2 = null;
                        }
                    }
                    if ((lValueOf2 != null && lValueOf2.longValue() != e9Var.f27988f) || (tL_forumTopic != null && lValueOf != null && tL_forumTopic.f22432id != lValueOf.longValue())) {
                        for (int size = b5Var.getFragmentStack().size() - 2; size > e9Var.f27985b; size--) {
                            ((ActionBarLayout) b5Var).Y(size);
                        }
                    } else if (b5Var.getFragmentStack() != null) {
                        ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                        int size2 = arrayList.size() - 2;
                        while (true) {
                            int i14 = e9Var.f27985b;
                            if (size2 > i14) {
                                ((org.telegram.ui.ActionBar.n2) arrayList.get(size2)).removeSelfFromStack();
                                size2--;
                            } else if (i14 < b5Var.getFragmentStack().size()) {
                                ((ActionBarLayout) b5Var).l(true, false);
                            }
                        }
                    }
                }
                Class cls = e9Var.f27984a;
                if (cls == rn.class) {
                    Bundle bundle = new Bundle();
                    TLRPC.Chat chat2 = e9Var.f27986c;
                    if (chat2 != null) {
                        bundle.putLong("chat_id", chat2.f22380id);
                    } else {
                        TLRPC.User user2 = e9Var.d;
                        if (user2 != null) {
                            bundle.putLong("user_id", user2.f22527id);
                        }
                    }
                    bundle.putInt("dialog_folder_id", e9Var.f27989g);
                    bundle.putInt("dialog_filter_id", e9Var.h);
                    TLRPC.TL_forumTopic tL_forumTopic2 = e9Var.f27987e;
                    if (tL_forumTopic2 != null) {
                        n2Var2.presentFragment(wf.c.g(n2Var2, e9Var.f27986c.f22380id, tL_forumTopic2, 0, bundle), true);
                    } else {
                        n2Var2.presentFragment(new rn(bundle), true);
                    }
                } else if (cls == ProfileActivity.class) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("dialog_id", e9Var.f27988f);
                    n2Var2.presentFragment(new ProfileActivity(bundle2, null), true);
                }
                if (e9Var.f27984a == we1.class) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("chat_id", e9Var.f27986c.f22380id);
                    n2Var2.presentFragment(new we1(bundle3), true);
                }
                if (e9Var.f27984a == gy.class) {
                    n2Var2.presentFragment(new gy(null), true);
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.n1 n1Var3 = (org.telegram.ui.ActionBar.n1) this.f13071b;
                ArrayList arrayList2 = (ArrayList) this.f13072c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) this.f13073e;
                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) this.f13074f;
                int iIntValue = ((Integer) view.getTag()).intValue();
                n1Var3.dismiss();
                if (((Integer) arrayList2.get(iIntValue)).intValue() == 1) {
                    kx0.a(tL_messages_stickerSet, n2Var4, c6Var3);
                } else {
                    ((rn) n2Var4).Y9();
                    kt.q().T = tL_messages_stickerSet;
                }
                break;
            case 11:
                pk pkVar = (pk) this.f13071b;
                String str5 = (String) this.f13072c;
                TranslateController translateController = (TranslateController) this.d;
                String str6 = (String) this.f13073e;
                org.telegram.ui.ActionBar.n1 n1Var4 = (org.telegram.ui.ActionBar.n1) this.f13074f;
                if (str5 != null) {
                    String lowerCase = str5.toLowerCase();
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    HashSet hashSetY = a31.Y();
                    hashSetY.add(lowerCase);
                    if (hashSetY.size() == 1 && hashSetY.contains(currentLocaleInfo.pluralLangCode)) {
                        a31.a0(null, Boolean.FALSE);
                    } else {
                        a31.a0(hashSetY, Boolean.FALSE);
                    }
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
                translateController.checkRestrictedLanguagesUpdate();
                translateController.setHideTranslateDialog(pkVar.f32072b, true);
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(pkVar.f32077r[0] ? LocaleController.formatString(R.string.AddedToDoNotTranslate, str6) : LocaleController.formatString(R.string.AddedToDoNotTranslateOther, str6));
                String[] strArr = b31.N;
                if (spannableStringBuilderReplaceTags != null && spannableStringBuilderReplaceTags.length() > 0) {
                    spannableStringBuilderReplaceTags.replace(0, 1, (CharSequence) spannableStringBuilderReplaceTags.toString().substring(0, 1).toUpperCase());
                    spannableStringBuilder = spannableStringBuilderReplaceTags;
                }
                mc.a0(pkVar.f32073c).J(R.raw.msg_translate, spannableStringBuilder, LocaleController.getString(R.string.Settings), new up0(pkVar, 24)).j();
                n1Var4.d(true);
                break;
            case 12:
                ft ftVar = (ft) this.f13071b;
                ArrayList arrayList3 = (ArrayList) this.f13072c;
                ta1 ta1Var = (ta1) this.d;
                LinearLayout linearLayout = (LinearLayout) this.f13073e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f13074f;
                kt ktVar = ftVar.f38203a;
                if (ktVar.f39878w != null) {
                    int iIntValue2 = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList3.get(iIntValue2)).intValue() == 2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = ktVar.T;
                        if (tL_messages_stickerSet2 == null) {
                            ta1Var.requestLayout();
                            linearLayout.requestLayout();
                            ta1Var.getAdapter().l();
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(1);
                        } else {
                            ht htVar = ktVar.f39868l;
                            if (htVar != null) {
                                htVar.u(tL_messages_stickerSet2.set, TextUtils.join("", ktVar.f39871o));
                            }
                            ktVar.p();
                        }
                    } else {
                        if (ktVar.f39868l != null) {
                            if (((Integer) arrayList3.get(iIntValue2)).intValue() == 1) {
                                ktVar.f39868l.O(TextUtils.join("", ktVar.f39871o));
                            } else if (((Integer) arrayList3.get(iIntValue2)).intValue() == 0) {
                                if (ktVar.f39868l.z()) {
                                    ktVar.f39868l.m(TextUtils.join("", ktVar.f39871o));
                                } else {
                                    ktVar.f39868l.x(TextUtils.join("", ktVar.f39871o));
                                }
                            }
                        }
                        ktVar.p();
                    }
                    break;
                }
                break;
            case 13:
                rf0 rf0Var = (rf0) this.f13071b;
                n2.l lVar = (n2.l) this.f13072c;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.d;
                String str7 = (String) this.f13073e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f13074f;
                lh.d dVar = rf0Var.f41919b;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    org.telegram.ui.x3 x3Var6 = new org.telegram.ui.x3(rf0Var, 8);
                    FileLog.d("LoginBilling, querying done purchases...");
                    BillingController.getInstance().queryPurchases("inapp", new f1.a(rf0Var, str7, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new l11(rf0Var, lVar, x3Var6, tL_inputStorePaymentAuthCode, 17)));
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f13074f;
                FrameLayout frameLayout = (FrameLayout) this.f13071b;
                ArrayList arrayList4 = (ArrayList) this.f13072c;
                int[] iArr = (int[]) this.d;
                qk0 qk0Var = (qk0) this.f13073e;
                b70 b70VarF = b70.F(e3Var2.container, e3Var2.getResourcesProvider(), frameLayout);
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList4.get(i15);
                    i15++;
                    int iIntValue3 = ((Integer) obj).intValue();
                    if (UserConfig.getInstance(iIntValue3).getCurrentUser() != null) {
                        b70VarF.e(iIntValue3, iArr[0] == iIntValue3, new xl(qk0Var, iIntValue3, 18));
                    }
                }
                b70VarF.f26993t = false;
                b70VarF.Y = true;
                b70VarF.f26992s = 0;
                b70VarF.f26974i = 3;
                b70VarF.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                b70VarF.Z();
                break;
            default:
                lh.d dVar2 = (lh.d) this.f13071b;
                boolean[] zArr2 = (boolean[]) this.f13072c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                String[] strArr2 = (String[]) this.f13073e;
                org.telegram.ui.ActionBar.e3 e3Var3 = (org.telegram.ui.ActionBar.e3) this.f13074f;
                if (dVar2.S) {
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        callback.run(strArr2[0]);
                    }
                    e3Var3.dismiss();
                    break;
                }
                break;
        }
    }

    public b0(org.telegram.ui.ActionBar.e3 e3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, qk0 qk0Var) {
        this.f13070a = 14;
        this.f13074f = e3Var;
        this.f13071b = frameLayout;
        this.f13072c = arrayList;
        this.d = iArr;
        this.f13073e = qk0Var;
    }
}
