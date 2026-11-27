package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class z87 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public z87(k17 k17Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, uc7 uc7Var, kf7 kf7Var) {
        this.a = (byte) 17;
        this.c = k17Var;
        this.h = str;
        this.d = tL_error;
        this.e = tLObject;
        this.b = uc7Var;
        this.f = kf7Var;
    }

    private final void a() {
        nt9 nt9Var = (nt9) this.b;
        lt9 lt9Var = (lt9) this.h;
        nt9Var.k = false;
        nt9Var.l = true;
        int i = nt9Var.a;
        uc7.s1(i).j4((ArrayList) this.c, true);
        uc7.s1(i).c4((ArrayList) this.d, true);
        wl.g(i).d((ArrayList) this.e);
        ArrayList arrayList = nt9Var.c;
        arrayList.clear();
        arrayList.addAll((ArrayList) this.f);
        nt9Var.l();
        if (!nt9Var.m) {
            lt9Var.run();
        }
    }

    private final void b() {
        nt9 nt9Var = (nt9) this.b;
        ArrayList arrayList = (ArrayList) this.f;
        zh6 zh6Var = (zh6) this.h;
        ArrayList arrayList2 = nt9Var.c;
        ArrayList arrayList3 = nt9Var.i;
        int i = nt9Var.a;
        uc7.s1(i).j4((ArrayList) this.c, true);
        uc7.s1(i).c4((ArrayList) this.d, true);
        wl.g(i).d((ArrayList) this.e);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            nt9Var.i(((Long) arrayList.get(i2)).longValue());
        }
        for (int i3 = 0; i3 < zh6Var.m(); i3++) {
            long j = zh6Var.j(i3);
            r47 r47Var = new r47(nt9Var.a, (TLRPC.Message) zh6Var.n(i3), null, null, null, null, null, false, false, 0L, false, false, true, 0);
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                mt9 mt9Var = (mt9) arrayList3.get(i4);
                if (mt9Var.a == j) {
                    mt9Var.c = r47Var.e1();
                    mt9Var.d = r47Var;
                }
            }
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                mt9 mt9Var2 = (mt9) arrayList2.get(i5);
                if (mt9Var2.a == j) {
                    mt9Var2.c = r47Var.e1();
                    mt9Var2.d = r47Var;
                }
            }
        }
        nt9Var.k();
    }

    private final void c() {
        wx9 wx9Var = (wx9) this.b;
        id idVar = (id) this.d;
        TLObject tLObject = (TLObject) this.e;
        byte[] bArr = (byte[]) this.f;
        TLRPC.User user = (TLRPC.User) this.h;
        wx9Var.n = false;
        if (!((Activity) this.c).isFinishing()) {
            try {
                idVar.dismiss();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject;
        encryptedChat.user_id = encryptedChat.participant_id;
        encryptedChat.seq_in = -2;
        encryptedChat.seq_out = 1;
        encryptedChat.a_or_b = bArr;
        wx9Var.getMessagesController().f4(encryptedChat, false);
        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
        tL_dialog.id = wf3.E(encryptedChat.id);
        tL_dialog.unread_count = 0;
        tL_dialog.top_message = 0;
        tL_dialog.last_message_date = wx9Var.getConnectionsManager().getCurrentTime();
        wx9Var.getMessagesController().R.k(tL_dialog.id, tL_dialog);
        wx9Var.getMessagesController().y.add(tL_dialog);
        wx9Var.getMessagesController().h5(null);
        kf7 messagesStorage = wx9Var.getMessagesStorage();
        messagesStorage.a.c(new oy6(messagesStorage, encryptedChat, user, tL_dialog, (byte) 10));
        wx9Var.getNotificationCenter().k(jn7.r, new Object[0]);
        wx9Var.getNotificationCenter().k(jn7.a0, encryptedChat);
        Utilities.d.c(new ux9(wx9Var, (byte) 0));
    }

    private final void d() {
        int i;
        int i2;
        int L;
        int i3;
        int i4;
        int L2;
        int i5;
        int i6;
        int i7;
        int i8;
        final b2a b2aVar = (b2a) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
        TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
        if (tL_error != null) {
            if (b2aVar.e2 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (tL_inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b2aVar.e2);
                        if (xc2.V(b2aVar.S1)) {
                            i8 = 2131751287;
                        } else {
                            i8 = 2131751280;
                        }
                        String M0 = ob6.M0(i8, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = hl.S2(ob6.a0(null, null, 2131751257, b2aVar.S1.title, lbc.k(user, true)));
                        alertDialog$Builder.j(ob6.M0(2131751261, null), new yw9(b2aVar, user, (byte) 3));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), new fd() {
                            @Override
                            public final void w(id idVar2, int i9) {
                                byte b = r2;
                                b2a b2aVar2 = b2aVar;
                                switch (b) {
                                    case 0:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        e S = LaunchActivity.S();
                                        if (S != null) {
                                            b2aVar2.dismiss();
                                            S.presentFragment(new o7c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                    default:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.o();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(b2aVar.a).sendRequest(new TL_account.getPassword(), new qn8(b2aVar, twoStepVerificationActivity, user, (byte) 6), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (b2aVar.e2 != null && !yac.h(k5.a(b2aVar.a).a).p()) {
                            e S = LaunchActivity.S();
                            if (S != null) {
                                new l46(5, b2aVar.a, null, b2aVar.e2, S);
                                return;
                            }
                            return;
                        }
                        e S2 = LaunchActivity.S();
                        if (S2 != null) {
                            b2aVar.dismiss();
                            S2.presentFragment(new axb(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.s0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        e S3 = LaunchActivity.S();
                        if (S3 != null) {
                            jj.e0(tL_error, S3, xc2.V(b2aVar.S1), xc2.Y(b2aVar.S1), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.s0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(b2aVar.e2);
                    alertDialog$Builder2.a.S = ob6.M0(2131751262, null);
                    LinearLayout linearLayout = new LinearLayout(b2aVar.e2);
                    linearLayout.setPadding(hl.L(24.0f), hl.L(2.0f), hl.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(b2aVar.e2);
                    int i9 = aob.j5;
                    yob.X(textView, i9, null);
                    textView.setTextSize(1, 16.0f);
                    if (ob6.a0) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    textView.setGravity(i | 48);
                    if (xc2.V(b2aVar.S1)) {
                        uh9.r(null, null, 2131751248, new Object[]{lbc.k(user, true)}, textView);
                    } else {
                        uh9.r(null, null, 2131751266, new Object[]{lbc.k(user, true)}, textView);
                    }
                    linearLayout.addView(textView, tre.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(b2aVar.e2);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(b2aVar.e2);
                    imageView.setImageResource(2131231627);
                    if (ob6.a0) {
                        i2 = hl.L(11.0f);
                    } else {
                        i2 = 0;
                    }
                    int L3 = hl.L(9.0f);
                    if (ob6.a0) {
                        L = 0;
                    } else {
                        L = hl.L(11.0f);
                    }
                    imageView.setPadding(i2, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    yob.s(imageView, i9, null, mode);
                    TextView textView2 = new TextView(b2aVar.e2);
                    yob.X(textView2, i9, null);
                    textView2.setTextSize(1, 16.0f);
                    if (ob6.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView2.setGravity(i3 | 48);
                    textView2.setText(hl.S2(ob6.M0(2131751265, null)));
                    if (ob6.a0) {
                        linearLayout2.addView(textView2, tre.o(-1, -2));
                        linearLayout2.addView(imageView, tre.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, tre.o(-2, -2));
                        linearLayout2.addView(textView2, tre.o(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(b2aVar.e2);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(b2aVar.e2);
                    imageView2.setImageResource(2131231627);
                    if (ob6.a0) {
                        i4 = hl.L(11.0f);
                    } else {
                        i4 = 0;
                    }
                    int L4 = hl.L(9.0f);
                    if (ob6.a0) {
                        L2 = 0;
                    } else {
                        L2 = hl.L(11.0f);
                    }
                    imageView2.setPadding(i4, L4, L2, 0);
                    yob.s(imageView2, i9, null, mode);
                    TextView textView3 = new TextView(b2aVar.e2);
                    yob.X(textView3, i9, null);
                    textView3.setTextSize(1, 16.0f);
                    if (ob6.a0) {
                        i5 = 5;
                    } else {
                        i5 = 3;
                    }
                    textView3.setGravity(i5 | 48);
                    textView3.setText(hl.S2(ob6.M0(2131751264, null)));
                    if (ob6.a0) {
                        linearLayout3.addView(textView3, tre.o(-1, -2));
                        i6 = 5;
                        linearLayout3.addView(imageView2, tre.r(-2, -2, 5));
                    } else {
                        i6 = 5;
                        linearLayout3.addView(imageView2, tre.o(-2, -2));
                        linearLayout3.addView(textView3, tre.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.j(ob6.M0(2131751256, null), new fd() {
                            @Override
                            public final void w(id idVar2, int i92) {
                                byte b = r2;
                                b2a b2aVar2 = b2aVar;
                                switch (b) {
                                    case 0:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        e S4 = LaunchActivity.S();
                                        if (S4 != null) {
                                            b2aVar2.dismiss();
                                            S4.presentFragment(new o7c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                    default:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.g(ob6.M0(2131752570, null), new fd() {
                            @Override
                            public final void w(id idVar2, int i92) {
                                byte b = r2;
                                b2a b2aVar2 = b2aVar;
                                switch (b) {
                                    case 0:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        e S4 = LaunchActivity.S();
                                        if (S4 != null) {
                                            b2aVar2.dismiss();
                                            S4.presentFragment(new o7c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                    default:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(b2aVar.e2);
                        yob.X(textView4, i9, null);
                        textView4.setTextSize(1, 16.0f);
                        if (ob6.a0) {
                            i7 = i6;
                        } else {
                            i7 = 3;
                        }
                        uh9.q(textView4, i7 | 48, null, 2131751263);
                        linearLayout.addView(textView4, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.g(ob6.M0(2131747558, null), new fd() {
                            @Override
                            public final void w(id idVar2, int i92) {
                                byte b = r2;
                                b2a b2aVar2 = b2aVar;
                                switch (b) {
                                    case 0:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        e S4 = LaunchActivity.S();
                                        if (S4 != null) {
                                            b2aVar2.dismiss();
                                            S4.presentFragment(new o7c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                    default:
                                        b2aVar2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.o();
                }
            }
        } else if (tL_inputCheckPasswordSRP != null) {
            zd zdVar = b2aVar.U1;
            if (zdVar != null) {
                zdVar.run();
            }
            b2aVar.dismiss();
            twoStepVerificationActivity.s0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    private final void e() {
        r7a r7aVar = (r7a) this.b;
        String str = (String) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        e4b e4bVar = (e4b) this.f;
        m7a m7aVar = new m7a(r7aVar);
        m7aVar.f = (String) this.h;
        m7aVar.e = str;
        m7aVar.g = (String) this.d;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k7a k7aVar = (k7a) arrayList.get(i);
            File file = new File(k7aVar.a);
            if (file.exists()) {
                long length = file.length();
                if (length != 0) {
                    m7aVar.h += length;
                    m7aVar.d.add(k7aVar);
                    m7aVar.a.put(k7aVar.a, k7aVar);
                    hashMap.put(k7aVar.a, m7aVar);
                }
            }
            if (i == 0) {
                hl.c3(new ux9(e4bVar, (byte) 14));
                return;
            }
        }
        hl.c3(new cp7(r7aVar, m7aVar, hashMap, str, e4bVar, (byte) 22));
    }

    private final void f() {
        r7a r7aVar = (r7a) this.b;
        TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
        r47 r47Var = (r47) this.d;
        File file = (File) this.f;
        d7a d7aVar = (d7a) this.e;
        String str = (String) this.h;
        if (tL_photo != null) {
            TLRPC.Message message = r47Var.k;
            message.media.photo = tL_photo;
            message.attachPath = file.toString();
            ArrayList arrayList = new ArrayList();
            arrayList.add(r47Var.k);
            r7aVar.getMessagesStorage().k1(arrayList, false, true, false, 0, false, r47Var.r1 ? 1 : 0, 0L);
            r7aVar.getNotificationCenter().k(jn7.l0, r47Var.k);
            d7aVar.g = (TLRPC.PhotoSize) c00.g(1, tL_photo.sizes);
            d7aVar.h = tL_photo;
            d7aVar.l = null;
            if (d7aVar.e == 4) {
                d7aVar.p = true;
                r7aVar.L(d7aVar, d7aVar.x.indexOf(r47Var));
                return;
            }
            r7aVar.L(d7aVar, -1);
            return;
        }
        if (f11.a) {
            StringBuilder p = ik8.p("can't load image ", str, " to file ");
            p.append(file.toString());
            cc4.d(p.toString());
        }
        d7aVar.c();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.run():void");
    }

    public z87(rv0 rv0Var, File file, id idVar, String str, String str2, String str3) {
        this.a = (byte) 4;
        this.b = rv0Var;
        this.f = file;
        this.c = idVar;
        this.h = str;
        this.d = str2;
        this.e = str3;
    }

    public z87(fn7 fn7Var, Object obj, Object obj2, String str, TLObject tLObject, Object obj3, byte b) {
        this.a = b;
        this.b = fn7Var;
        this.c = obj;
        this.d = obj2;
        this.h = str;
        this.e = tLObject;
        this.f = obj3;
    }

    public z87(b18 b18Var, TLRPC.TL_error tL_error, String str, j08 j08Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = (byte) 20;
        this.b = b18Var;
        this.c = tL_error;
        this.h = str;
        this.d = j08Var;
        this.e = tLObject;
        this.f = sendverifyphonecode;
    }

    public z87(r7a r7aVar, TLObject tLObject, TLRPC.InputMedia inputMedia, d7a d7aVar, String str, r47 r47Var) {
        this.a = (byte) 29;
        this.b = r7aVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = d7aVar;
        this.h = str;
        this.f = r47Var;
    }

    public z87(r7a r7aVar, TLRPC.TL_photo tL_photo, r47 r47Var, File file, d7a d7aVar, String str) {
        this.a = (byte) 28;
        this.b = r7aVar;
        this.c = tL_photo;
        this.d = r47Var;
        this.f = file;
        this.e = d7aVar;
        this.h = str;
    }

    public z87(File file, File file2, boolean[] zArr, pcc pccVar, id idVar, boolean[] zArr2) {
        this.a = (byte) 16;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = pccVar;
        this.e = idVar;
        this.h = zArr2;
    }

    public z87(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public z87(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.h = str;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
