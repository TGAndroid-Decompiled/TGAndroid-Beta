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
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.ty;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.bi1;
import org.telegram.ui.bq0;
import org.telegram.ui.br0;
import org.telegram.ui.eh0;
import org.telegram.ui.f50;
import org.telegram.ui.fh0;
import org.telegram.ui.j01;
import org.telegram.ui.k01;
import org.telegram.ui.kq0;
import org.telegram.ui.mm0;
import org.telegram.ui.n80;
import org.telegram.ui.nn0;
import org.telegram.ui.oq0;
import org.telegram.ui.p80;
import org.telegram.ui.pi1;
import org.telegram.ui.rt0;
import org.telegram.ui.zn;
public final class m4 implements View.OnClickListener {
    public final int f5593a;
    public final int f5594b;
    public final Object f5595c;

    public m4(Object obj, int i10, int i11) {
        this.f5593a = i11;
        this.f5595c = obj;
        this.f5594b = i10;
    }

    @Override
    public final void onClick(View view) {
        Utilities.Callback callback;
        boolean z10;
        boolean z11;
        int i10;
        org.telegram.ui.Components.tc j3;
        int i11 = this.f5593a;
        int i12 = this.f5594b;
        Object obj = this.f5595c;
        switch (i11) {
            case 0:
                cb cbVar = (cb) obj;
                if (cbVar.f5944e.contains(Integer.valueOf(i12))) {
                    if (cbVar.f5944e.size() > 1) {
                        cbVar.f5944e.remove(Integer.valueOf(i12));
                    } else {
                        return;
                    }
                } else {
                    cbVar.f5944e.add(Integer.valueOf(i12));
                }
                AndroidUtilities.forEachViews((RecyclerView) cbVar.f5942b, (Utilities.Callback<View>) new ai.y1(cbVar, 10));
                return;
            case 1:
                u6 u6Var = ((s6) obj).f5956b;
                if (u6Var.f6075r && (callback = u6Var.f6073f) != null) {
                    callback.run(Integer.valueOf(i12));
                    return;
                }
                return;
            case 2:
                ((ii.e2) obj).P.Z3(i12);
                return;
            case 3:
                View.OnClickListener onClickListener = ((jh.e) obj).f14178b[i12];
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
                            g0Var.f26528f0 = !g0Var.f26528f0;
                        }
                    } else {
                        g0Var.f26527e0 = !g0Var.f26527e0;
                    }
                } else {
                    g0Var.f26526d0 = !g0Var.f26526d0;
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
                boolean z13 = ChatAttachAlertPhotoLayout.f24021q1;
                chatAttachAlertPhotoLayout.f30173b.f33211a1.getActionBarMenuOnItemClick().b(i12);
                chatAttachAlertPhotoLayout.f24065w.M(null, null);
                return;
            case 9:
                ((f50) obj).f25230b.x(i12, true);
                return;
            case 10:
                f50 f50Var = ((b40) obj).f24890c;
                f50Var.p(i12);
                f50Var.dismiss();
                return;
            case 11:
                ee0 ee0Var = (ee0) obj;
                if (ee0Var.f26070e.getAdapter() instanceof ce0) {
                    a00 a00Var = ((ty) ((ce0) ee0Var.f26070e.getAdapter())).f31304c;
                    if ((i12 == 1 || i12 == 2) && a00Var.f24465w1) {
                        if (i12 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        a00Var.P(true, false, z10);
                        return;
                    } else if (i12 == 0 && a00Var.f24461v1) {
                        a00Var.P(true, true, false);
                        return;
                    }
                }
                ee0Var.f26070e.x(i12, false);
                return;
            case 12:
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) obj;
                EditTextBoldCursor editTextBoldCursor = s4Var.f33603c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                s4Var.d.run(Integer.valueOf(i12), editTextBoldCursor.getText().toString());
                s4Var.dismiss();
                return;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i12, scrollSlidingTextTabStrip.f24304a.indexOfChild(view));
                return;
            case 14:
                q71 q71Var = (q71) obj;
                int i13 = q71Var.f30098b.f24266i.f31421q;
                if (i13 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    q71Var.updateAppUpdateViews(i12, true);
                    return;
                } else if (i13 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    q71Var.updateAppUpdateViews(i12, true);
                    return;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", q71Var.d, null, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((org.telegram.ui.Components.voip.x0) obj).f32359b.x(i12, true);
                return;
            case 16:
                pi1 pi1Var = (pi1) obj;
                if (pi1Var.U == null && view.getAlpha() != 0.0f) {
                    pi1Var.c(i12, true);
                    return;
                }
                return;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i12);
                return;
            case 18:
                p80 p80Var = (p80) obj;
                p80Var.Q.dismiss();
                int i14 = p80Var.f40698c0;
                if (i14 >= 0) {
                    p80Var.f40699d0.setKeepMedia(i14, i12);
                    n80 n80Var = p80Var.f40700e0;
                    if (n80Var != null) {
                        n80Var.a(i12);
                        return;
                    }
                    return;
                }
                n80 n80Var2 = p80Var.f40700e0;
                if (n80Var2 != null) {
                    n80Var2.a(i12);
                    return;
                }
                return;
            case 19:
                fh0 fh0Var = (fh0) obj;
                ValueAnimator valueAnimator = fh0Var.f36687c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    bi1 bi1Var = fh0Var.f36687c;
                    if (!bi1Var.H) {
                        if (bi1Var.getCurrentPosition() == i12) {
                            org.telegram.ui.ActionBar.n2 X = fh0Var.X();
                            if (X instanceof eh0) {
                                ((eh0) X).s();
                                return;
                            }
                            return;
                        }
                        fh0Var.m0(i12, true);
                        fh0Var.f36687c.D(i12);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                nn0 nn0Var = (nn0) obj;
                mm0 mm0Var = nn0Var.D1;
                nn0Var.S0 = i12;
                if (i12 == 1) {
                    nn0Var.f40261i0 = nn0Var.f40257g0;
                } else if (i12 == 4) {
                    nn0Var.f40261i0 = nn0Var.f40259h0;
                } else if (i12 == 2) {
                    nn0Var.f40261i0 = nn0Var.f40252e0;
                } else if (i12 == 3) {
                    nn0Var.f40261i0 = nn0Var.f40255f0;
                } else {
                    nn0Var.f40261i0 = nn0Var.f40249d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, nn0Var, null);
                if (i12 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(nn0Var.f40264j1);
                    PhotoViewer.t1().c2(arrayList, 0, mm0Var);
                    return;
                } else if (i12 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(nn0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, mm0Var);
                    return;
                } else if (i12 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(nn0Var.f40268m1);
                    PhotoViewer.t1().c2(arrayList3, 0, mm0Var);
                    return;
                } else if (i12 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = nn0Var.f40262i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), mm0Var);
                    return;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = nn0Var.f40266k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), mm0Var);
                    return;
                }
            case 21:
                kq0 kq0Var = (kq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var = kq0Var.I;
                if (n1Var != null && n1Var.isShowing()) {
                    kq0Var.I.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.g5.K(kq0Var.getParentActivity(), kq0Var.F.a(), new bq0(kq0Var, 2));
                    return;
                }
                kq0Var.V(kq0Var.f39330b, kq0Var.f39331c, true, 0);
                kq0Var.finishFragment();
                return;
            case 22:
                br0 br0Var = (br0) obj;
                org.telegram.ui.ActionBar.n1 n1Var2 = br0Var.m0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    br0Var.m0.d(true);
                }
                if (i12 == 0) {
                    org.telegram.ui.Components.g5.K(br0Var.getParentActivity(), br0Var.U.a(), new oq0(br0Var, 1));
                    return;
                } else {
                    br0Var.e0(0, true);
                    return;
                }
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i15 = PopupNotificationActivity.f34112b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    k01 k01Var = profileActivity.O;
                    if (!k01Var.C1) {
                        if (bw0.w0(k01Var.getClosestTab())) {
                            k01 k01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), k01Var2.h1(k01Var2.getClosestTab()));
                            return;
                        } else if (!profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            return;
                        } else {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            lc D = lc.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.f5533x = new j01(profileActivity);
                            D.Q(null);
                            return;
                        }
                    }
                }
                if (bw0.w0(profileActivity.O.getClosestTab())) {
                    long a2 = profileActivity.a();
                    k01 k01Var3 = profileActivity.O;
                    int h12 = k01Var3.h1(k01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.o8 o8Var = profileActivity.f34379x5;
                    if (o8Var != null) {
                        o8Var.run();
                        profileActivity.f34379x5 = null;
                    }
                    org.telegram.ui.Components.tc.e();
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
                org.telegram.messenger.o8 o8Var2 = profileActivity.f34379x5;
                if (o8Var2 != null) {
                    o8Var2.run();
                    profileActivity.f34379x5 = null;
                }
                org.telegram.ui.Components.tc.e();
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
                    profileActivity.f34379x5 = new org.telegram.messenger.o8(profileActivity, clientUserId, arrayList7, z11, 9);
                    org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList7, zArr2, clientUserId, 7);
                    if (z14) {
                        j3 = org.telegram.ui.Components.ad.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j();
                    } else {
                        j3 = org.telegram.ui.Components.ad.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j();
                    }
                    j3.v = new rt0(20, profileActivity, zArr3);
                    return;
                }
                return;
            case 25:
                bb1 bb1Var = (bb1) obj;
                bb1Var.f36217i0.D(i12);
                bb1Var.m0(i12, true);
                return;
            case 26:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                EditText editText = h9Var.f35005a;
                TextView[] textViewArr = h9Var.N;
                TextView textView = textViewArr[i12];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i12].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    h9Var.a();
                    h9Var.a();
                    Runnable runnable = h9Var.f35011r;
                    if (runnable != null) {
                        editText.post(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                yh.q0 q0Var = ((yh.r0) obj).f53100j0;
                int i19 = yh.q0.f53053s;
                q0Var.a(i12);
                return;
            default:
                ((yh.q0) obj).a(i12);
                return;
        }
    }

    public m4(MessageObject messageObject, int i10) {
        this.f5593a = 23;
        this.f5594b = i10;
        this.f5595c = messageObject;
    }
}
