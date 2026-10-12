package di;

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
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.hb1;
import org.telegram.ui.hq0;
import org.telegram.ui.hr0;
import org.telegram.ui.hz0;
import org.telegram.ui.ii1;
import org.telegram.ui.jh0;
import org.telegram.ui.kh0;
import org.telegram.ui.m50;
import org.telegram.ui.q01;
import org.telegram.ui.qq0;
import org.telegram.ui.r01;
import org.telegram.ui.r80;
import org.telegram.ui.sm0;
import org.telegram.ui.t80;
import org.telegram.ui.un0;
import org.telegram.ui.uq0;
import org.telegram.ui.wi1;
public final class m4 implements View.OnClickListener {
    public final int f7420a;
    public final int f7421b;
    public final Object f7422c;

    public m4(Object obj, int i10, int i11) {
        this.f7420a = i11;
        this.f7422c = obj;
        this.f7421b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.sc j10;
        int i11 = this.f7420a;
        int i12 = this.f7421b;
        Object obj = this.f7422c;
        switch (i11) {
            case 0:
                bb bbVar = (bb) obj;
                if (bbVar.e.contains(Integer.valueOf(i12))) {
                    if (bbVar.e.size() > 1) {
                        bbVar.e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    bbVar.e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) bbVar.f7753b, (Utilities.Callback<View>) new bi.o1(bbVar, 10));
                return;
            case 1:
                s6 s6Var = ((q6) obj).f7648b;
                if (s6Var.f7770r && (callback = s6Var.f7768f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ji.d2) obj).P.Z3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((kh.e) obj).f14267b[i12];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 4:
                kh.a aVar = ((kh.h) obj).h;
                if (aVar != null) {
                    aVar.j(i12);
                    return;
                }
                return;
            case 5:
                ((fo) obj).L9(i12);
                return;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            g0Var.f25156f0 = !g0Var.f25156f0;
                        }
                    } else {
                        g0Var.f25155e0 = !g0Var.f25155e0;
                    }
                } else {
                    g0Var.f25154d0 = !g0Var.f25154d0;
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
                boolean z13 = ChatAttachAlertPhotoLayout.f23018q1;
                chatAttachAlertPhotoLayout.f27671b.f29985a1.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f23062w.M(null, null);
                return;
            case 9:
                ((m50) obj).f31466b.x(i12, true);
                return;
            case 10:
                m50 m50Var = ((x30) obj).f31147c;
                m50Var.o(i12);
                m50Var.dismiss();
                return;
            case 11:
                de0 de0Var = (de0) obj;
                if (de0Var.e.getAdapter() instanceof be0) {
                    wz wzVar = ((py) ((be0) de0Var.e.getAdapter())).f28446c;
                    if ((i12 == 1 || i12 == 2) && wzVar.f31077w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        wzVar.P(true, false, z10);
                        return;
                    } else if (i12 == 0 && wzVar.f31073v1) {
                        wzVar.P(true, true, false);
                        return;
                    }
                }
                de0Var.e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) obj;
                EditTextBoldCursor editTextBoldCursor = s4Var.f30090c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                s4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                s4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f23286a.indexOfChild(view));
                return;
            case 14:
                n71 n71Var = (n71) obj;
                int i13 = n71Var.f27601b.f23250i.f29336q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    n71Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    n71Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", n71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((org.telegram.ui.Components.voip.v0) obj).f30545b.x(i12, true);
                return;
            case 16:
                wi1 wi1Var = (wi1) obj;
                if (wi1Var.U == null && view.getAlpha() != 0.0f) {
                    wi1Var.c(i12, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 18:
                t80 t80Var = (t80) obj;
                t80Var.Q.dismiss();
                int i14 = t80Var.f40308c0;
                if (i14 >= 0) {
                    t80Var.f40309d0.setKeepMedia(i14, i12);
                    r80 r80Var = t80Var.f40310e0;
                    if (r80Var != null) {
                        r80Var.a(i12);
                        return;
                    }
                    return;
                }
                r80 r80Var2 = t80Var.f40310e0;
                if (r80Var2 != null) {
                    r80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                kh0 kh0Var = (kh0) obj;
                ValueAnimator valueAnimator = kh0Var.f37392c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ii1 ii1Var = kh0Var.f37392c;
                    if (!ii1Var.H) {
                        if (ii1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.m2 X = kh0Var.X();
                            if (X instanceof jh0) {
                                ((jh0) X).t();
                                return;
                            }
                            return;
                        }
                        kh0Var.m0(i12, true);
                        kh0Var.f37392c.D(i12);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                un0 un0Var = (un0) obj;
                sm0 sm0Var = un0Var.D1;
                un0Var.S0 = i12;
                if (i12 == 1) {
                    un0Var.f40739i0 = un0Var.f40735g0;
                } else if (i12 == 4) {
                    un0Var.f40739i0 = un0Var.f40737h0;
                } else if (i12 == 2) {
                    un0Var.f40739i0 = un0Var.f40730e0;
                } else if (i12 == 3) {
                    un0Var.f40739i0 = un0Var.f40733f0;
                } else {
                    un0Var.f40739i0 = un0Var.f40728d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, un0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(un0Var.f40742j1);
                    PhotoViewer.t1().c2(arrayList, 0, sm0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(un0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, sm0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(un0Var.f40746m1);
                    PhotoViewer.t1().c2(arrayList3, 0, sm0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = un0Var.f40740i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), sm0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = un0Var.f40744k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), sm0Var);
                    return;
                }
            case 21:
                qq0 qq0Var = (qq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = qq0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    qq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.g5.K(qq0Var.getParentActivity(), qq0Var.F.a(), new hq0(qq0Var, 2));
                    return;
                }
                qq0Var.V(qq0Var.f39517b, qq0Var.f39518c, true, 0);
                qq0Var.finishFragment();
                return;
            case 22:
                hr0 hr0Var = (hr0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = hr0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    hr0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.g5.K(hr0Var.getParentActivity(), hr0Var.U.a(), new uq0(hr0Var, 1));
                    return;
                } else {
                    hr0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f32433b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    r01 r01Var = profileActivity.O;
                    if (!r01Var.C1) {
                        if (xv0.w0(r01Var.getClosestTab())) {
                            r01 r01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), r01Var2.h1(r01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            kc D = kc.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f7308x = new q01(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (xv0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    r01 r01Var3 = profileActivity.O;
                    int h12 = r01Var3.h1(r01Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.r8 r8Var = profileActivity.f32696x5;
                    if (r8Var != null) {
                        r8Var.run();
                        profileActivity.f32696x5 = null;
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
                        org.telegram.messenger.k7 k7Var = new org.telegram.messenger.k7(profileActivity, a2, h12, arrayList6, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList6);
                        org.telegram.ui.Components.zc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList6.size(), w9)), LocaleController.getString(R.string.UndoNoCaps), k7Var).j();
                        return;
                    }
                    return;
                }
                long clientUserId = profileActivity.getUserConfig().getClientUserId();
                org.telegram.messenger.r8 r8Var2 = profileActivity.f32696x5;
                if (r8Var2 != null) {
                    r8Var2.run();
                    profileActivity.f32696x5 = null;
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
                    profileActivity.f32696x5 = new org.telegram.messenger.r8(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j10 = org.telegram.ui.Components.zc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j10 = org.telegram.ui.Components.zc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j10.v = new hz0(1, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                hb1 hb1Var = (hb1) obj;
                hb1Var.f36698i0.D(i12);
                hb1Var.m0(i12, true);
                return;
            case 26:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                EditText editText = h9Var.f33260a;
                TextView[] textViewArr = h9Var.N;
                TextView textView = textViewArr[i12];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i12].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    h9Var.a();
                    h9Var.a();
                    Runnable runnable = h9Var.f33265r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                zh.q0 q0Var = ((zh.r0) obj).f51042j0;
                int i19 = zh.q0.f50999s;
                q0Var.a(i12);
                return;
            default:
                ((zh.q0) obj).a(i12);
                return;
        }
    }

    public m4(MessageObject messageObject, int i10) {
        this.f7420a = 23;
        this.f7421b = i10;
        this.f7422c = messageObject;
    }
}
