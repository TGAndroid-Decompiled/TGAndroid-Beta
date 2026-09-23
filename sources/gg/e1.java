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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ag0;
import org.telegram.ui.i4;
import org.telegram.ui.ia0;
import org.telegram.ui.r60;
import org.telegram.ui.ry;
import org.telegram.ui.tq;
public final class e1 implements Runnable {
    public final int f9705a;
    public final int f9706b;
    public final Object f9707c;
    public final Object d;
    public final Object e;
    public final Object f9708f;
    public final Object h;
    public final Object f9709n;

    public e1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f9705a = 1;
        this.f9706b = i10;
        this.f9707c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f9708f = albumEntry;
        this.h = albumEntry2;
        this.f9709n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.e1.run():void");
    }

    public e1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f9705a = i11;
        this.d = obj;
        this.f9706b = i10;
        this.f9707c = serializable;
        this.e = obj2;
        this.f9708f = obj3;
        this.h = obj4;
        this.f9709n = obj5;
    }

    public e1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f9705a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f9707c = inputFile;
        this.e = inputMedia;
        this.f9708f = delayedMessage;
        this.f9706b = i10;
        this.f9709n = str;
    }

    public e1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, d6 d6Var, r60 r60Var) {
        this.f9705a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.f9707c = context;
        this.f9706b = i10;
        this.e = exportgroupcallinvite;
        this.f9708f = d6Var;
        this.f9709n = r60Var;
    }

    public e1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, tq tqVar) {
        this.f9705a = 6;
        this.f9708f = tL_error;
        this.h = tLObject;
        this.f9707c = arrayList;
        this.f9706b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f9709n = tqVar;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, nf.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f9705a = 8;
        this.d = b2Var;
        this.f9707c = eVar;
        this.h = tLObject;
        this.f9706b = i10;
        this.e = context;
        this.f9709n = tL_inputGroupCallSlug;
        this.f9708f = tL_error;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f9705a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.f9706b = i10;
        this.f9707c = document;
        this.f9708f = tL_error;
        this.e = obj;
        this.f9709n = tL_stickers_addStickerToSet;
    }

    public e1(i4 i4Var, int i10, nf.e eVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f9705a = 3;
        this.d = i4Var;
        this.f9706b = i10;
        this.f9707c = eVar;
        this.h = tLObject;
        this.e = str;
        this.f9708f = g0Var;
        this.f9709n = tL_messages_getWebPage;
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, ry ryVar, n2 n2Var, TLRPC.User user, String str) {
        this.f9705a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f9706b = i10;
        this.f9707c = ryVar;
        this.e = n2Var;
        this.f9708f = user;
        this.f9709n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, ia0 ia0Var, String str) {
        this.f9705a = 9;
        this.d = launchActivity;
        this.f9708f = tL_error;
        this.h = tLObject;
        this.f9706b = i10;
        this.f9707c = b2Var;
        this.e = ia0Var;
        this.f9709n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, ia0 ia0Var, int i10, String str) {
        this.f9705a = 10;
        this.d = launchActivity;
        this.f9708f = tL_error;
        this.h = tLObject;
        this.f9707c = tL_inputInvoiceSlug;
        this.e = ia0Var;
        this.f9706b = i10;
        this.f9709n = str;
    }

    public e1(ag0 ag0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f9705a = 12;
        this.d = ag0Var;
        this.f9707c = str;
        this.e = hVar;
        this.f9708f = list;
        this.h = str2;
        this.f9709n = str3;
        this.f9706b = i10;
    }

    public e1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f9705a = 13;
        this.d = profileActivity;
        this.f9707c = view;
        this.e = str;
        this.f9706b = i10;
        this.f9708f = zArr;
        this.h = strArr;
        this.f9709n = str2;
    }

    public e1(org.telegram.ui.web.b1 b1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, da daVar) {
        this.f9705a = 14;
        this.d = b1Var;
        this.f9707c = str;
        this.h = tLObject;
        this.f9708f = tL_error;
        this.f9706b = i10;
        this.e = y0Var;
        this.f9709n = daVar;
    }
}
