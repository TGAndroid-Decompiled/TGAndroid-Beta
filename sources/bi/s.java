package bi;

import android.content.DialogInterface;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.StateSet;
import java.io.File;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.bj;
import org.telegram.ui.bt0;
import org.telegram.ui.cj;
import org.telegram.ui.dj;
import org.telegram.ui.eo;
import org.telegram.ui.pn;
import org.telegram.ui.vm;
public final class s implements Runnable {
    public final int f3634a;
    public final int f3635b;
    public final Object f3636c;

    public s(int i10, Object obj, int i11) {
        this.f3634a = i11;
        this.f3635b = i10;
        this.f3636c = obj;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z10;
        int i10;
        int i11;
        String str;
        CharSequence charSequence;
        int i12;
        int i13;
        int i14;
        int i15 = this.f3634a;
        boolean z11 = false;
        final int i16 = this.f3635b;
        Object obj = this.f3636c;
        switch (i15) {
            case 0:
                ((r) obj).run(Integer.valueOf(i16));
                return;
            case 1:
                ((Utilities.Callback) obj).run(Integer.valueOf(i16));
                return;
            case 2:
                ((f3) obj).p0(i16);
                return;
            case 3:
                MessagesController.getInstance(i16).putUsers((ArrayList) obj, true);
                return;
            case 4:
                ce ceVar = (ce) obj;
                int i17 = ceVar.f2437c;
                ceVar.m();
                ceVar.X1 = false;
                File file = ceVar.K1.O0;
                if (file != null) {
                    file.delete();
                    ceVar.K1.O0 = null;
                }
                ceVar.W(ceVar.K1, true);
                CharSequence[] charSequenceArr = {ceVar.f2439c1.getText()};
                if (MessagesController.getInstance(i17).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i17).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {ceVar.K1.C0};
                if (MessagesController.getInstance(i17).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i17).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                r9 r9Var = ceVar.K1;
                if (TextUtils.equals(r9Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                r9Var.f3581k = z10;
                ceVar.K1.C0 = new SpannableString(ceVar.f2439c1.getText());
                ceVar.z();
                ceVar.y();
                r9 r9Var2 = ceVar.K1;
                if (r9Var2 != null && r9Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                ceVar.O1 = i10;
                ceVar.K1 = (r9) ceVar.H1.get(i16);
                ceVar.O(0, 1);
                ceVar.N(0, 1);
                ceVar.f2442d1.f3388b.Y2.N(false);
                ceVar.f2439c1.setText(ceVar.K1.C0);
                return;
            case 5:
                ((c2.b) obj).f4074b.onAudioFocusChange(i16);
                return;
            case 6:
                ((fg.h0) obj).m(i16);
                return;
            case 7:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i16).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i16).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                gh.h hVar = (gh.h) obj;
                hVar.getClass();
                try {
                    hVar.f9143a.scrollBy(0, i16);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 9:
                hi.f0 f0Var = (hi.f0) obj;
                hi.i0 i0Var = f0Var.f9562f;
                if (f0Var.f9561c && i0Var.E != null && i0Var.f9464a != null) {
                    f0Var.d = true;
                    f0Var.f9559a.setPressed(false);
                    try {
                        f0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    hi.g0 g0Var = i0Var.E;
                    hi.a aVar = i0Var.f9464a;
                    hi.z3 z3Var = ((hi.r3) g0Var).f9821a;
                    z3Var.n3(false);
                    z3Var.f10001h3.t(new hi.w3(z3Var, aVar, i16), f0Var);
                    return;
                }
                return;
            case 10:
                String str2 = e2.d0.f7188a;
                e2.c cVar = ((i2.b0) ((k2.j) ((of.b) obj).f14295c)).f10108a.E;
                i2.v vVar = new i2.v(i16, 2);
                cVar.getClass();
                if (Looper.myLooper() == ((e2.z) cVar.f7185c).f7243a.getLooper()) {
                    z11 = true;
                }
                e2.d.g(z11);
                cVar.f7183a++;
                cVar.i(new af(20, cVar, vVar));
                Integer num = (Integer) cVar.e;
                cVar.n(Integer.valueOf(i16));
                return;
            case 11:
                ((mh.a) obj).v0(i16, 0, null);
                return;
            case 12:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    try {
                        d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i16, true);
                            }
                        });
                        d2VarArr[0].show();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                ConnectionsManager.lambda$onUpdateConfig$21(i16, (TLRPC.TL_config) obj);
                return;
            case 14:
                MessagesController.getInstance(i16).loadFullChat(((TLRPC.Chat) obj).f17195id, 0, true);
                return;
            case 15:
                ((org.telegram.ui.q4) ((org.telegram.ui.g) obj).f32950b).V(i16, true);
                return;
            case 16:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                int i18 = t1Var.f20359v7;
                if (i16 == i18) {
                    org.telegram.ui.Cells.e0 e0Var = (org.telegram.ui.Cells.e0) t1Var.f20256o7.get(i18);
                    if (e0Var != null) {
                        org.telegram.ui.Cells.z zVar = e0Var.f19042s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var.b(false);
                        if (!t1Var.f20403y7.scheduled) {
                            if (e0Var.f19033j != null) {
                                t1Var.k();
                            } else if (e0Var.f19032i != null) {
                                t1Var.k();
                                org.telegram.ui.Cells.k1 k1Var = t1Var.Jc;
                                if (k1Var != null) {
                                    k1Var.F1(t1Var, e0Var.f19032i);
                                }
                            }
                        }
                    }
                    t1Var.f20359v7 = -1;
                    t1Var.a3();
                    return;
                }
                return;
            case 17:
                ((org.telegram.ui.ge) obj).f33069f.c(i16);
                return;
            case 18:
                ((dj) obj).f31924a.E(this.f3635b, 0, 0, 0, true, true);
                return;
            case 19:
                eo eoVar = ((bj) obj).f31277g;
                if (eoVar.f32540wb == i16) {
                    eoVar.Ma();
                    return;
                }
                return;
            case 20:
                eo eoVar2 = ((cj) obj).f31681g;
                if (eoVar2.f32540wb == i16) {
                    eoVar2.Ma();
                    return;
                }
                return;
            case 21:
                eo eoVar3 = ((bj) obj).f31277g;
                if (eoVar3.f32540wb == i16) {
                    eoVar3.Ma();
                    return;
                }
                return;
            case 22:
                eo eoVar4 = ((cj) obj).f31681g;
                if (eoVar4.f32540wb == i16) {
                    eoVar4.Ma();
                    return;
                }
                return;
            case 23:
                eo eoVar5 = ((cj) obj).f31681g;
                if (eoVar5.f32540wb == i16) {
                    eoVar5.Ma();
                    return;
                }
                return;
            case 24:
                eo eoVar6 = ((vm) obj).J0;
                eoVar6.f32567z0.h1(i16, eoVar6.f32558y4);
                return;
            case 25:
                i11 = ((org.telegram.ui.ActionBar.p2) ((pn) obj).f35881a).currentAccount;
                ConnectionsManager.getInstance(i11).cancelRequest(i16, true);
                return;
            case 26:
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.v1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 27:
                m90 m90Var = (m90) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i16).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i19 = 0;
                    while (true) {
                        if (i19 < privacyRules.size()) {
                            if (privacyRules.get(i19) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i19) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i19) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i19++;
                            }
                        }
                    }
                }
                m90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.o1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            case 28:
                ((org.telegram.ui.Components.o8) obj).b(i16);
                return;
            default:
                org.telegram.ui.Components.jd jdVar = (org.telegram.ui.Components.jd) obj;
                x4 x4Var = jdVar.f24353d1;
                if (jdVar.f24351b1 != i16) {
                    jdVar.setTimer(i16);
                    Utilities.Callback callback = jdVar.f24366r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i16));
                    }
                    float f7 = 1.0f;
                    if (i16 == 0) {
                        if (jdVar.f24365q1) {
                            i14 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i14 = R.string.TimerPeriodPhotoKeep;
                        }
                        charSequence = LocaleController.getString(i14);
                        x4Var.h = jdVar.getMeasuredWidth();
                        x4Var.p(false);
                        x4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x4Var.f3882e0 = AndroidUtilities.dp(0);
                        x4Var.f3881d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i16 == Integer.MAX_VALUE) {
                        if (jdVar.f24365q1) {
                            i12 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i12 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        charSequence = LocaleController.getString(i12);
                        x4Var.h = jdVar.getMeasuredWidth();
                        x4Var.p(false);
                        x4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x4Var.f3882e0 = AndroidUtilities.dp(0);
                        x4Var.f3881d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i16 > 0) {
                        if (jdVar.f24365q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i16, new Object[0]));
                        x4Var.p(true);
                        x4Var.h = x4.a(replaceTags, x4Var.getTextPaint());
                        x4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        x4Var.f3882e0 = AndroidUtilities.dp(2);
                        x4Var.f3881d0 = 0.0f;
                        charSequence = replaceTags;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), jdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (jdVar instanceof bt0) {
                        f7 = -1.0f;
                    }
                    x4Var.setTranslationY(dp * f7);
                    x4Var.s(charSequence);
                    if (i16 > 0) {
                        i13 = R.raw.fire_on;
                    } else {
                        i13 = R.raw.fire_off;
                    }
                    hj0 hj0Var = new hj0(i13, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    hj0Var.start();
                    x4Var.j(hj0Var);
                    x4Var.u();
                    jdVar.f24363o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(jdVar.f24364p1);
                    jdVar.invalidate();
                    return;
                }
                return;
        }
    }

    public s(Object obj, int i10, int i11) {
        this.f3634a = i11;
        this.f3636c = obj;
        this.f3635b = i10;
    }
}
