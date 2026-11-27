package defpackage;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;
public final class yb0 {
    public final jn5 a;
    public final jn5 b;
    public final jn5 c;
    public final String d;
    public final String e;
    public final String f;
    public final BitmapDrawable g;
    public final Object h;
    public final ec0[] i;
    public final ac0 j;

    public yb0(jn5 jn5Var, jn5 jn5Var2, jn5 jn5Var3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, ec0[] ec0VarArr, ac0 ac0Var) {
        this.a = jn5Var;
        this.b = jn5Var2;
        this.c = jn5Var3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bitmapDrawable;
        this.h = obj;
        this.i = ec0VarArr;
        this.j = ac0Var;
    }

    public static yb0 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, ec0... ec0VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        jn5 jn5Var;
        String str2;
        TLRPC.ChatPhoto chatPhoto;
        jn5 m = jn5.m(yac.t0, 0, chat);
        jn5 m2 = jn5.m(yac.t0, 1, chat);
        String str3 = null;
        if (m2 != null && (m2.k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (chat != null && (chatPhoto = chat.photo) != null) {
            bitmapDrawable = chatPhoto.strippedBitmap;
        } else {
            bitmapDrawable = null;
        }
        TLRPC.Photo photo = chatFull.chat_photo;
        if (photo != null && !photo.video_sizes.isEmpty()) {
            TLRPC.VideoSize x = xb4.x(1000, chatFull.chat_photo.video_sizes);
            jn5Var = jn5.j(x, chatFull.chat_photo);
            str2 = xb4.r(null, x);
        } else {
            jn5Var = null;
            str2 = null;
        }
        if (jn5Var != null && jn5Var.p == 2) {
            str3 = "g";
        }
        return new yb0(m, m2, jn5Var, str, str3, str2, bitmapDrawable, chat, ec0VarArr, null);
    }

    public static yb0 b(TLRPC.User user, int i, ec0... ec0VarArr) {
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        jn5 m = jn5.m(yac.t0, 0, user);
        jn5 m2 = jn5.m(yac.t0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        if (m2 != null && (m2.k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new yb0(m, m2, null, str, null, null, bitmapDrawable, user, ec0VarArr, new ac0(i, jn7.E0, user));
    }

    public static yb0 c(TLRPC.User user, TLRPC.UserFull userFull, ec0... ec0VarArr) {
        String str;
        BitmapDrawable bitmapDrawable;
        jn5 jn5Var;
        String str2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        jn5 m = jn5.m(yac.t0, 0, userFull.user);
        String str3 = null;
        if (m == null && (photo = userFull.profile_photo) != null) {
            m = jn5.i(xb4.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        jn5 jn5Var2 = m;
        jn5 m2 = jn5.m(yac.t0, 1, userFull.user);
        if (m2 != null && (m2.k instanceof TLRPC.TL_photoStrippedSize)) {
            str = "b";
        } else {
            str = null;
        }
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        } else {
            bitmapDrawable = null;
        }
        TLRPC.Photo photo2 = userFull.profile_photo;
        if (photo2 != null && !photo2.video_sizes.isEmpty()) {
            TLRPC.VideoSize x = xb4.x(1000, userFull.profile_photo.video_sizes);
            jn5 j = jn5.j(x, userFull.profile_photo);
            str2 = xb4.r(null, x);
            jn5Var = j;
        } else {
            jn5Var = null;
            str2 = null;
        }
        if (jn5Var != null && jn5Var.p == 2) {
            str3 = "g";
        }
        return new yb0(jn5Var2, m2, jn5Var, str, str3, str2, bitmapDrawable, userFull.user, ec0VarArr, null);
    }
}
