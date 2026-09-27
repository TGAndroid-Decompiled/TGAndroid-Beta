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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cg0;
import org.telegram.ui.ea0;
import org.telegram.ui.j4;
import org.telegram.ui.s60;
import org.telegram.ui.tq;
import org.telegram.ui.ty;
public final class e1 implements Runnable {
    public final int f9710a;
    public final int f9711b;
    public final Object f9712c;
    public final Object d;
    public final Object e;
    public final Object f9713f;
    public final Object h;
    public final Object f9714n;

    public e1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f9710a = 1;
        this.f9711b = i10;
        this.f9712c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f9713f = albumEntry;
        this.h = albumEntry2;
        this.f9714n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.e1.run():void");
    }

    public e1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f9710a = i11;
        this.d = obj;
        this.f9711b = i10;
        this.f9712c = serializable;
        this.e = obj2;
        this.f9713f = obj3;
        this.h = obj4;
        this.f9714n = obj5;
    }

    public e1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f9710a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f9712c = inputFile;
        this.e = inputMedia;
        this.f9713f = delayedMessage;
        this.f9711b = i10;
        this.f9714n = str;
    }

    public e1(TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, e6 e6Var, s60 s60Var) {
        this.f9710a = 5;
        this.h = tLObject;
        this.d = c2Var;
        this.f9712c = context;
        this.f9711b = i10;
        this.e = exportgroupcallinvite;
        this.f9713f = e6Var;
        this.f9714n = s60Var;
    }

    public e1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, tq tqVar) {
        this.f9710a = 6;
        this.f9713f = tL_error;
        this.h = tLObject;
        this.f9712c = arrayList;
        this.f9711b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f9714n = tqVar;
    }

    public e1(org.telegram.ui.ActionBar.c2 c2Var, nf.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f9710a = 8;
        this.d = c2Var;
        this.f9712c = eVar;
        this.h = tLObject;
        this.f9711b = i10;
        this.e = context;
        this.f9714n = tL_inputGroupCallSlug;
        this.f9713f = tL_error;
    }

    public e1(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f9710a = 7;
        this.d = c2Var;
        this.h = tLObject;
        this.f9711b = i10;
        this.f9712c = document;
        this.f9713f = tL_error;
        this.e = obj;
        this.f9714n = tL_stickers_addStickerToSet;
    }

    public e1(j4 j4Var, int i10, nf.e eVar, TLObject tLObject, String str, org.telegram.ui.h0 h0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f9710a = 3;
        this.d = j4Var;
        this.f9711b = i10;
        this.f9712c = eVar;
        this.h = tLObject;
        this.e = str;
        this.f9713f = h0Var;
        this.f9714n = tL_messages_getWebPage;
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, ty tyVar, o2 o2Var, TLRPC.User user, String str) {
        this.f9710a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f9711b = i10;
        this.f9712c = tyVar;
        this.e = o2Var;
        this.f9713f = user;
        this.f9714n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.c2 c2Var, ea0 ea0Var, String str) {
        this.f9710a = 9;
        this.d = launchActivity;
        this.f9713f = tL_error;
        this.h = tLObject;
        this.f9711b = i10;
        this.f9712c = c2Var;
        this.e = ea0Var;
        this.f9714n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, ea0 ea0Var, int i10, String str) {
        this.f9710a = 10;
        this.d = launchActivity;
        this.f9713f = tL_error;
        this.h = tLObject;
        this.f9712c = tL_inputInvoiceSlug;
        this.e = ea0Var;
        this.f9711b = i10;
        this.f9714n = str;
    }

    public e1(cg0 cg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f9710a = 12;
        this.d = cg0Var;
        this.f9712c = str;
        this.e = hVar;
        this.f9713f = list;
        this.h = str2;
        this.f9714n = str3;
        this.f9711b = i10;
    }

    public e1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f9710a = 13;
        this.d = profileActivity;
        this.f9712c = view;
        this.e = str;
        this.f9711b = i10;
        this.f9713f = zArr;
        this.h = strArr;
        this.f9714n = str2;
    }

    public e1(org.telegram.ui.web.c1 c1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.z0 z0Var, da daVar) {
        this.f9710a = 14;
        this.d = c1Var;
        this.f9712c = str;
        this.h = tLObject;
        this.f9713f = tL_error;
        this.f9711b = i10;
        this.e = z0Var;
        this.f9714n = daVar;
    }
}
