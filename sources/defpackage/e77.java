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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e77 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public e77(d17 d17Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, oc7 oc7Var, cf7 cf7Var) {
        this.a = (byte) 17;
        this.c = d17Var;
        this.h = str;
        this.d = tL_error;
        this.e = tLObject;
        this.b = oc7Var;
        this.f = cf7Var;
    }

    private final void a() {
        wr9 wr9Var = (wr9) this.b;
        ArrayList arrayList = (ArrayList) this.f;
        vh6 vh6Var = (vh6) this.h;
        ArrayList arrayList2 = wr9Var.c;
        ArrayList arrayList3 = wr9Var.i;
        int i = wr9Var.a;
        oc7.r1(i).d4((ArrayList) this.c, true);
        oc7.r1(i).X3((ArrayList) this.d, true);
        vm.g(i).d((ArrayList) this.e);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            wr9Var.i(((Long) arrayList.get(i2)).longValue());
        }
        for (int i3 = 0; i3 < vh6Var.m(); i3++) {
            long j = vh6Var.j(i3);
            k47 k47Var = new k47(wr9Var.a, (TLRPC.Message) vh6Var.n(i3), null, null, null, null, null, false, false, 0L, false, false, true, 0);
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                vr9 vr9Var = (vr9) arrayList3.get(i4);
                if (vr9Var.a == j) {
                    vr9Var.c = k47Var.e1();
                    vr9Var.d = k47Var;
                }
            }
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                vr9 vr9Var2 = (vr9) arrayList2.get(i5);
                if (vr9Var2.a == j) {
                    vr9Var2.c = k47Var.e1();
                    vr9Var2.d = k47Var;
                }
            }
        }
        wr9Var.k();
    }

    private final void b() {
        wr9 wr9Var = (wr9) this.b;
        ur9 ur9Var = (ur9) this.h;
        wr9Var.k = false;
        wr9Var.l = true;
        int i = wr9Var.a;
        oc7.r1(i).d4((ArrayList) this.c, true);
        oc7.r1(i).X3((ArrayList) this.d, true);
        vm.g(i).d((ArrayList) this.e);
        ArrayList arrayList = wr9Var.c;
        arrayList.clear();
        arrayList.addAll((ArrayList) this.f);
        wr9Var.l();
        if (!wr9Var.m) {
            ur9Var.run();
        }
    }

    private final void c() {
        dw9 dw9Var = (dw9) this.b;
        he heVar = (he) this.d;
        TLObject tLObject = (TLObject) this.e;
        byte[] bArr = (byte[]) this.f;
        TLRPC.User user = (TLRPC.User) this.h;
        dw9Var.n = false;
        if (!((Activity) this.c).isFinishing()) {
            try {
                heVar.dismiss();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject;
        encryptedChat.user_id = encryptedChat.participant_id;
        encryptedChat.seq_in = -2;
        encryptedChat.seq_out = 1;
        encryptedChat.a_or_b = bArr;
        dw9Var.getMessagesController().Z3(encryptedChat, false);
        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
        tL_dialog.id = pg3.E(encryptedChat.id);
        tL_dialog.unread_count = 0;
        tL_dialog.top_message = 0;
        tL_dialog.last_message_date = dw9Var.getConnectionsManager().getCurrentTime();
        dw9Var.getMessagesController().R.k(tL_dialog, tL_dialog.id);
        dw9Var.getMessagesController().y.add(tL_dialog);
        dw9Var.getMessagesController().b5(null);
        cf7 messagesStorage = dw9Var.getMessagesStorage();
        messagesStorage.a.c(new jy6(messagesStorage, encryptedChat, user, tL_dialog, (byte) 10));
        dw9Var.getNotificationCenter().k(nm7.r, new Object[0]);
        dw9Var.getNotificationCenter().k(nm7.a0, encryptedChat);
        Utilities.d.c(new kf9(dw9Var, (byte) 22));
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
        final k0a k0aVar = (k0a) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
        TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.h;
        if (tL_error != null) {
            if (k0aVar.e2 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (tL_inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k0aVar.e2);
                        if (sd2.V(k0aVar.S1)) {
                            i8 = 2131751259;
                        } else {
                            i8 = 2131751252;
                        }
                        String M0 = jb6.M0(i8, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = gm.S2(jb6.a0(null, null, 2131751229, k0aVar.S1.title, m9c.k(user, true)));
                        alertDialog$Builder.j(jb6.M0(2131751233, null), new xr8(k0aVar, user, (byte) 18));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), new ee() {
                            @Override
                            public final void r(he heVar2, int i9) {
                                byte b = r2;
                                k0a k0aVar2 = k0aVar;
                                switch (b) {
                                    case 0:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        d S = LaunchActivity.S();
                                        if (S != null) {
                                            k0aVar2.dismiss();
                                            S.presentFragment(new p5c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                    default:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.o();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(k0aVar.a).sendRequest(new TL_account.getPassword(), new fm8(k0aVar, twoStepVerificationActivity, user, (byte) 6), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (k0aVar.e2 != null && !z8c.h(j5.a(k0aVar.a).a).p()) {
                            d S = LaunchActivity.S();
                            if (S != null) {
                                new i46(5, k0aVar.a, null, k0aVar.e2, S);
                                return;
                            }
                            return;
                        }
                        d S2 = LaunchActivity.S();
                        if (S2 != null) {
                            k0aVar.dismiss();
                            S2.presentFragment(new avb(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.t0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        d S3 = LaunchActivity.S();
                        if (S3 != null) {
                            ik.e0(tL_error, S3, sd2.V(k0aVar.S1), sd2.Y(k0aVar.S1), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k0aVar.e2);
                    alertDialog$Builder2.a.S = jb6.M0(2131751234, null);
                    LinearLayout linearLayout = new LinearLayout(k0aVar.e2);
                    linearLayout.setPadding(gm.L(24.0f), gm.L(2.0f), gm.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(k0aVar.e2);
                    int i9 = cmb.i5;
                    anb.X(textView, i9, null);
                    textView.setTextSize(1, 16.0f);
                    if (jb6.a0) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    textView.setGravity(i | 48);
                    if (sd2.V(k0aVar.S1)) {
                        hg9.q(null, null, 2131751220, new Object[]{m9c.k(user, true)}, textView);
                    } else {
                        hg9.q(null, null, 2131751238, new Object[]{m9c.k(user, true)}, textView);
                    }
                    linearLayout.addView(textView, qoe.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(k0aVar.e2);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(k0aVar.e2);
                    imageView.setImageResource(2131231628);
                    if (jb6.a0) {
                        i2 = gm.L(11.0f);
                    } else {
                        i2 = 0;
                    }
                    int L3 = gm.L(9.0f);
                    if (jb6.a0) {
                        L = 0;
                    } else {
                        L = gm.L(11.0f);
                    }
                    imageView.setPadding(i2, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    anb.s(imageView, i9, null, mode);
                    TextView textView2 = new TextView(k0aVar.e2);
                    anb.X(textView2, i9, null);
                    textView2.setTextSize(1, 16.0f);
                    if (jb6.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView2.setGravity(i3 | 48);
                    textView2.setText(gm.S2(jb6.M0(2131751237, null)));
                    if (jb6.a0) {
                        linearLayout2.addView(textView2, qoe.o(-1, -2));
                        linearLayout2.addView(imageView, qoe.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, qoe.o(-2, -2));
                        linearLayout2.addView(textView2, qoe.o(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(k0aVar.e2);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(k0aVar.e2);
                    imageView2.setImageResource(2131231628);
                    if (jb6.a0) {
                        i4 = gm.L(11.0f);
                    } else {
                        i4 = 0;
                    }
                    int L4 = gm.L(9.0f);
                    if (jb6.a0) {
                        L2 = 0;
                    } else {
                        L2 = gm.L(11.0f);
                    }
                    imageView2.setPadding(i4, L4, L2, 0);
                    anb.s(imageView2, i9, null, mode);
                    TextView textView3 = new TextView(k0aVar.e2);
                    anb.X(textView3, i9, null);
                    textView3.setTextSize(1, 16.0f);
                    if (jb6.a0) {
                        i5 = 5;
                    } else {
                        i5 = 3;
                    }
                    textView3.setGravity(i5 | 48);
                    textView3.setText(gm.S2(jb6.M0(2131751236, null)));
                    if (jb6.a0) {
                        linearLayout3.addView(textView3, qoe.o(-1, -2));
                        i6 = 5;
                        linearLayout3.addView(imageView2, qoe.r(-2, -2, 5));
                    } else {
                        i6 = 5;
                        linearLayout3.addView(imageView2, qoe.o(-2, -2));
                        linearLayout3.addView(textView3, qoe.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.j(jb6.M0(2131751228, null), new ee() {
                            @Override
                            public final void r(he heVar2, int i92) {
                                byte b = r2;
                                k0a k0aVar2 = k0aVar;
                                switch (b) {
                                    case 0:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        d S4 = LaunchActivity.S();
                                        if (S4 != null) {
                                            k0aVar2.dismiss();
                                            S4.presentFragment(new p5c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                    default:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.g(jb6.M0(2131752542, null), new ee() {
                            @Override
                            public final void r(he heVar2, int i92) {
                                byte b = r2;
                                k0a k0aVar2 = k0aVar;
                                switch (b) {
                                    case 0:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        d S4 = LaunchActivity.S();
                                        if (S4 != null) {
                                            k0aVar2.dismiss();
                                            S4.presentFragment(new p5c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                    default:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(k0aVar.e2);
                        anb.X(textView4, i9, null);
                        textView4.setTextSize(1, 16.0f);
                        if (jb6.a0) {
                            i7 = i6;
                        } else {
                            i7 = 3;
                        }
                        hg9.p(textView4, i7 | 48, null, 2131751235);
                        linearLayout.addView(textView4, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.g(jb6.M0(2131747564, null), new ee() {
                            @Override
                            public final void r(he heVar2, int i92) {
                                byte b = r2;
                                k0a k0aVar2 = k0aVar;
                                switch (b) {
                                    case 0:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                    case 1:
                                        d S4 = LaunchActivity.S();
                                        if (S4 != null) {
                                            k0aVar2.dismiss();
                                            S4.presentFragment(new p5c(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                    default:
                                        k0aVar2.c2.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.o();
                }
            }
        } else if (tL_inputCheckPasswordSRP != null) {
            eh ehVar = k0aVar.U1;
            if (ehVar != null) {
                ehVar.run();
            }
            k0aVar.dismiss();
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    private final void e() {
        a6a a6aVar = (a6a) this.b;
        String str = (String) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        h2b h2bVar = (h2b) this.f;
        v5a v5aVar = new v5a(a6aVar);
        v5aVar.f = (String) this.h;
        v5aVar.e = str;
        v5aVar.g = (String) this.d;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            t5a t5aVar = (t5a) arrayList.get(i);
            File file = new File(t5aVar.a);
            if (file.exists()) {
                long length = file.length();
                if (length != 0) {
                    v5aVar.h += length;
                    v5aVar.d.add(t5aVar);
                    v5aVar.a.put(t5aVar.a, t5aVar);
                    hashMap.put(t5aVar.a, v5aVar);
                }
            }
            if (i == 0) {
                gm.c3(new c0a(h2bVar, (byte) 4));
                return;
            }
        }
        gm.c3(new hz7(a6aVar, v5aVar, hashMap, str, h2bVar, (byte) 21));
    }

    private final void f() {
        a6a a6aVar = (a6a) this.b;
        TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
        k47 k47Var = (k47) this.d;
        File file = (File) this.f;
        m5a m5aVar = (m5a) this.e;
        String str = (String) this.h;
        if (tL_photo != null) {
            TLRPC.Message message = k47Var.k;
            message.media.photo = tL_photo;
            message.attachPath = file.toString();
            ArrayList arrayList = new ArrayList();
            arrayList.add(k47Var.k);
            a6aVar.getMessagesStorage().g1(arrayList, false, true, false, 0, false, k47Var.r1 ? 1 : 0, 0L);
            a6aVar.getNotificationCenter().k(nm7.l0, k47Var.k);
            m5aVar.g = (TLRPC.PhotoSize) b10.f(1, tL_photo.sizes);
            m5aVar.h = tL_photo;
            m5aVar.l = null;
            if (m5aVar.e == 4) {
                m5aVar.p = true;
                a6aVar.L(m5aVar, m5aVar.x.indexOf(k47Var));
                return;
            }
            a6aVar.L(m5aVar, -1);
            return;
        }
        if (e21.a) {
            StringBuilder p = wi8.p("can't load image ", str, " to file ");
            p.append(file.toString());
            fc4.d(p.toString());
        }
        m5aVar.c();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e77.run():void");
    }

    public e77(qw0 qw0Var, File file, he heVar, String str, String str2, String str3) {
        this.a = (byte) 4;
        this.b = qw0Var;
        this.f = file;
        this.c = heVar;
        this.h = str;
        this.d = str2;
        this.e = str3;
    }

    public e77(jm7 jm7Var, Object obj, Object obj2, String str, TLObject tLObject, Object obj3, byte b) {
        this.a = b;
        this.b = jm7Var;
        this.c = obj;
        this.d = obj2;
        this.h = str;
        this.e = tLObject;
        this.f = obj3;
    }

    public e77(xz7 xz7Var, TLRPC.TL_error tL_error, String str, ez7 ez7Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = (byte) 20;
        this.b = xz7Var;
        this.c = tL_error;
        this.h = str;
        this.d = ez7Var;
        this.e = tLObject;
        this.f = sendverifyphonecode;
    }

    public e77(a6a a6aVar, TLObject tLObject, TLRPC.InputMedia inputMedia, m5a m5aVar, String str, k47 k47Var) {
        this.a = (byte) 29;
        this.b = a6aVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = m5aVar;
        this.h = str;
        this.f = k47Var;
    }

    public e77(a6a a6aVar, TLRPC.TL_photo tL_photo, k47 k47Var, File file, m5a m5aVar, String str) {
        this.a = (byte) 28;
        this.b = a6aVar;
        this.c = tL_photo;
        this.d = k47Var;
        this.f = file;
        this.e = m5aVar;
        this.h = str;
    }

    public e77(File file, File file2, boolean[] zArr, qac qacVar, he heVar, boolean[] zArr2) {
        this.a = (byte) 16;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = qacVar;
        this.e = heVar;
        this.h = zArr2;
    }

    public e77(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public e77(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.h = str;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
