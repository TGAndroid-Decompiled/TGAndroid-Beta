package ci;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.uy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.ai1;
import org.telegram.ui.aq0;
import org.telegram.ui.ar0;
import org.telegram.ui.dh0;
import org.telegram.ui.eh0;
import org.telegram.ui.f50;
import org.telegram.ui.i01;
import org.telegram.ui.j01;
import org.telegram.ui.jq0;
import org.telegram.ui.lm0;
import org.telegram.ui.m80;
import org.telegram.ui.mn0;
import org.telegram.ui.ni1;
import org.telegram.ui.nq0;
import org.telegram.ui.o80;
import org.telegram.ui.tt0;
import org.telegram.ui.zn;
public final class m4 implements View.OnClickListener {
    public final int f5592a;
    public final int f5593b;
    public final Object f5594c;

    public m4(Object obj, int i10, int i11) {
        this.f5592a = i11;
        this.f5594c = obj;
        this.f5593b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.sc j3;
        int i11 = this.f5592a;
        int i12 = this.f5593b;
        Object obj = this.f5594c;
        switch (i11) {
            case 0:
                cb cbVar = (cb) obj;
                if (cbVar.f5943e.contains(Integer.valueOf(i12))) {
                    if (cbVar.f5943e.size() > 1) {
                        cbVar.f5943e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    cbVar.f5943e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) cbVar.f5941b, (Utilities.Callback<View>) new ai.y1(cbVar, 10));
                return;
            case 1:
                u6 u6Var = ((s6) obj).f5955b;
                if (u6Var.f6074r && (callback = u6Var.f6072f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ii.e2) obj).P.Z3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((jh.e) obj).f14177b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                jh.a aVar = ((jh.h) obj).h;
                if (aVar != null) {
                    aVar.h(i12);
                    return;
                }
                return;
            case 5:
                ((zn) obj).L9(i12);
                return;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            g0Var.f26613f0 = !g0Var.f26613f0;
                        }
                    } else {
                        g0Var.f26612e0 = !g0Var.f26612e0;
                    }
                } else {
                    g0Var.f26611d0 = !g0Var.f26611d0;
                }
                g0Var.X.N(true);
                g0Var.u();
                return;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                boolean z12 = !zArr[i12];
                zArr[i12] = z12;
                ((org.telegram.ui.Cells.a2) view).c(z12, true);
                return;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f24049q1;
                chatAttachAlertPhotoLayout.f30245b.f33272a1.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f24093w.M(null, null);
                return;
            case 9:
                ((f50) obj).f25603b.x(i12, true);
                return;
            case 10:
                f50 f50Var = ((c40) obj).f25214c;
                f50Var.p(i12);
                f50Var.dismiss();
                return;
            case 11:
                fe0 fe0Var = (fe0) obj;
                if (fe0Var.f26451e.getAdapter() instanceof de0) {
                    b00 b00Var = ((uy) ((de0) fe0Var.f26451e.getAdapter())).f31745c;
                    if ((i12 == 1 || i12 == 2) && b00Var.f24795w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b00Var.P(true, false, z10);
                        return;
                    } else if (i12 == 0 && b00Var.f24791v1) {
                        b00Var.P(true, true, false);
                        return;
                    }
                }
                fe0Var.f26451e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) obj;
                EditTextBoldCursor editTextBoldCursor = s4Var.f24635c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                s4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                s4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f24332a.indexOfChild(view));
                return;
            case 14:
                r71 r71Var = (r71) obj;
                int i13 = r71Var.f30446b.f24294i.f31505q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    r71Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    r71Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", r71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((org.telegram.ui.Components.voip.y0) obj).f32482b.x(i12, true);
                return;
            case 16:
                ni1 ni1Var = (ni1) obj;
                if (ni1Var.U == null && view.getAlpha() != 0.0f) {
                    ni1Var.c(i12, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 18:
                o80 o80Var = (o80) obj;
                o80Var.Q.dismiss();
                int i14 = o80Var.f40474c0;
                if (i14 >= 0) {
                    o80Var.f40475d0.setKeepMedia(i14, i12);
                    m80 m80Var = o80Var.f40476e0;
                    if (m80Var != null) {
                        m80Var.a(i12);
                        return;
                    }
                    return;
                }
                m80 m80Var2 = o80Var.f40476e0;
                if (m80Var2 != null) {
                    m80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                eh0 eh0Var = (eh0) obj;
                ValueAnimator valueAnimator = eh0Var.f36435c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ai1 ai1Var = eh0Var.f36435c;
                    if (!ai1Var.H) {
                        if (ai1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.m2 X = eh0Var.X();
                            if (X instanceof dh0) {
                                ((dh0) X).s();
                                return;
                            }
                            return;
                        }
                        eh0Var.m0(i12, true);
                        eh0Var.f36435c.D(i12);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                mn0 mn0Var = (mn0) obj;
                lm0 lm0Var = mn0Var.D1;
                mn0Var.S0 = i12;
                if (i12 == 1) {
                    mn0Var.f40037i0 = mn0Var.f40033g0;
                } else if (i12 == 4) {
                    mn0Var.f40037i0 = mn0Var.f40035h0;
                } else if (i12 == 2) {
                    mn0Var.f40037i0 = mn0Var.f40028e0;
                } else if (i12 == 3) {
                    mn0Var.f40037i0 = mn0Var.f40031f0;
                } else {
                    mn0Var.f40037i0 = mn0Var.f40025d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, mn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(mn0Var.f40040j1);
                    PhotoViewer.t1().c2(arrayList, 0, lm0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(mn0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, lm0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(mn0Var.f40044m1);
                    PhotoViewer.t1().c2(arrayList3, 0, lm0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = mn0Var.f40038i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), lm0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = mn0Var.f40042k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), lm0Var);
                    return;
                }
            case 21:
                jq0 jq0Var = (jq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = jq0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    jq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.g5.K(jq0Var.getParentActivity(), jq0Var.F.a(), new aq0(jq0Var, 2));
                    return;
                }
                jq0Var.V(jq0Var.f39134b, jq0Var.f39135c, true, 0);
                jq0Var.finishFragment();
                return;
            case 22:
                ar0 ar0Var = (ar0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = ar0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    ar0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.g5.K(ar0Var.getParentActivity(), ar0Var.U.a(), new nq0(ar0Var, 1));
                    return;
                } else {
                    ar0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f34174b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    j01 j01Var = profileActivity.O;
                    if (!j01Var.C1) {
                        if (cw0.w0(j01Var.getClosestTab())) {
                            j01 j01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), j01Var2.h1(j01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            lc D = lc.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f5532x = new i01(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (cw0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    j01 j01Var3 = profileActivity.O;
                    int h12 = j01Var3.h1(j01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.o8 o8Var = profileActivity.f34441x5;
                    if (o8Var != null) {
                        o8Var.run();
                        profileActivity.f34441x5 = null;
                    }
                    org.telegram.ui.Components.sc.e();
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        for (int i16 = 0; i16 < actionModeSelected.size(); i16++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i16).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                            }
                        }
                    }
                    profileActivity.O.L(false);
                    if (!arrayList6.isEmpty()) {
                        org.telegram.messenger.h7 h7Var = new org.telegram.messenger.h7(profileActivity, a2, h12, arrayList6, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        org.telegram.ui.Components.ad.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), h7Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.o8 o8Var2 = profileActivity.f34441x5;
                if (o8Var2 != null) {
                    o8Var2.run();
                    profileActivity.f34441x5 = null;
                }
                org.telegram.ui.Components.sc.e();
                if (profileActivity.O.getClosestTab() == 9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ArrayList arrayList7 = new ArrayList();
                SparseArray<MessageObject> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                if (actionModeSelected2 != null) {
                    i10 = 0;
                    for (int i17 = 0; i17 < actionModeSelected2.size(); i17++) {
                        TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i17).storyItem;
                        if (storyItem2 != null) {
                            arrayList7.add(storyItem2);
                            i10++;
                        }
                    }
                } else {
                    i10 = 0;
                }
                profileActivity.O.L(false);
                if (z11) {
                    profileActivity.O.Y0(8);
                }
                if (!arrayList7.isEmpty()) {
                    boolean[] zArr2 = new boolean[arrayList7.size()];
                    for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                        TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList7.get(i18);
                        zArr2[i18] = storyItem3.pinned;
                        storyItem3.pinned = z11;
                    }
                    profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList7, false);
                    boolean[] zArr3 = {false};
                    boolean z14 = z11;
                    profileActivity.f34441x5 = new org.telegram.messenger.o8(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j3 = org.telegram.ui.Components.ad.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j3 = org.telegram.ui.Components.ad.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j3.v = new tt0(19, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                ab1 ab1Var = (ab1) obj;
                ab1Var.f36008i0.D(i12);
                ab1Var.m0(i12, true);
                return;
            case 26:
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) obj;
                EditText editText = j9Var.f35160a;
                TextView[] textViewArr = j9Var.N;
                TextView textView = textViewArr[i12];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i12].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    j9Var.a();
                    j9Var.a();
                    Runnable runnable = j9Var.f35166r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                yh.q0 q0Var = ((yh.r0) obj).f53221j0;
                int i19 = yh.q0.f53174s;
                q0Var.a(i12);
                return;
            default:
                ((yh.q0) obj).a(i12);
                return;
        }
    }

    public m4(MessageObject messageObject, int i10) {
        this.f5592a = 23;
        this.f5593b = i10;
        this.f5594c = messageObject;
    }
}
