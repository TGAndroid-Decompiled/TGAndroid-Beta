package gg;

import ai.da;
import android.content.Context;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i4;
import org.telegram.ui.m80;
import org.telegram.ui.p60;
import org.telegram.ui.qy;
import org.telegram.ui.sq;
import org.telegram.ui.zf0;
public final class e1 implements Runnable {
    public final int f9704a;
    public final int f9705b;
    public final Object f9706c;
    public final Object d;
    public final Object e;
    public final Object f9707f;
    public final Object h;
    public final Object f9708n;

    public e1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f9704a = 1;
        this.f9705b = i10;
        this.f9706c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f9707f = albumEntry;
        this.h = albumEntry2;
        this.f9708n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.e1.run():void");
    }

    public e1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f9704a = i11;
        this.d = obj;
        this.f9705b = i10;
        this.f9706c = serializable;
        this.e = obj2;
        this.f9707f = obj3;
        this.h = obj4;
        this.f9708n = obj5;
    }

    public e1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f9704a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f9706c = inputFile;
        this.e = inputMedia;
        this.f9707f = delayedMessage;
        this.f9705b = i10;
        this.f9708n = str;
    }

    public e1(TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, d6 d6Var, p60 p60Var) {
        this.f9704a = 5;
        this.h = tLObject;
        this.d = a2Var;
        this.f9706c = context;
        this.f9705b = i10;
        this.e = exportgroupcallinvite;
        this.f9707f = d6Var;
        this.f9708n = p60Var;
    }

    public e1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, sq sqVar) {
        this.f9704a = 6;
        this.f9707f = tL_error;
        this.h = tLObject;
        this.f9706c = arrayList;
        this.f9705b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f9708n = sqVar;
    }

    public e1(org.telegram.ui.ActionBar.a2 a2Var, nf.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f9704a = 8;
        this.d = a2Var;
        this.f9706c = eVar;
        this.h = tLObject;
        this.f9705b = i10;
        this.e = context;
        this.f9708n = tL_inputGroupCallSlug;
        this.f9707f = tL_error;
    }

    public e1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f9704a = 7;
        this.d = a2Var;
        this.h = tLObject;
        this.f9705b = i10;
        this.f9706c = document;
        this.f9707f = tL_error;
        this.e = obj;
        this.f9708n = tL_stickers_addStickerToSet;
    }

    public e1(i4 i4Var, int i10, nf.e eVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f9704a = 3;
        this.d = i4Var;
        this.f9705b = i10;
        this.f9706c = eVar;
        this.h = tLObject;
        this.e = str;
        this.f9707f = g0Var;
        this.f9708n = tL_messages_getWebPage;
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, qy qyVar, m2 m2Var, TLRPC.User user, String str) {
        this.f9704a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f9705b = i10;
        this.f9706c = qyVar;
        this.e = m2Var;
        this.f9707f = user;
        this.f9708n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.a2 a2Var, m80 m80Var, String str) {
        this.f9704a = 9;
        this.d = launchActivity;
        this.f9707f = tL_error;
        this.h = tLObject;
        this.f9705b = i10;
        this.f9706c = a2Var;
        this.e = m80Var;
        this.f9708n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, m80 m80Var, int i10, String str) {
        this.f9704a = 10;
        this.d = launchActivity;
        this.f9707f = tL_error;
        this.h = tLObject;
        this.f9706c = tL_inputInvoiceSlug;
        this.e = m80Var;
        this.f9705b = i10;
        this.f9708n = str;
    }

    public e1(zf0 zf0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f9704a = 12;
        this.d = zf0Var;
        this.f9706c = str;
        this.e = hVar;
        this.f9707f = list;
        this.h = str2;
        this.f9708n = str3;
        this.f9705b = i10;
    }

    public e1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f9704a = 13;
        this.d = profileActivity;
        this.f9706c = view;
        this.e = str;
        this.f9705b = i10;
        this.f9707f = zArr;
        this.h = strArr;
        this.f9708n = str2;
    }

    public e1(org.telegram.ui.web.b1 b1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, da daVar) {
        this.f9704a = 14;
        this.d = b1Var;
        this.f9706c = str;
        this.h = tLObject;
        this.f9707f = tL_error;
        this.f9705b = i10;
        this.e = y0Var;
        this.f9708n = daVar;
    }
}
