package defpackage;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class yo8 {
    public final int a;
    public boolean b;
    public ap8 c;
    public final boolean[] g;
    public boolean i;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList j = new ArrayList();

    public yo8(int i, int i2) {
        boolean[] zArr = new boolean[2];
        this.g = zArr;
        this.a = i2;
        if (i2 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String valueOf = String.valueOf(i2);
            for (int i3 = 0; i3 < valueOf.length(); i3++) {
                int charAt = valueOf.charAt(i3) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = bp8.s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            hq6.d0(i).m0(tL_inputStickerSetShortName, 0, false, false, new f28(this, hashSet, arrayList, (byte) 3));
        }
        String str = bp8.s[Utilities.b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        hq6.d0(i).m0(tL_inputStickerSetShortName2, 0, false, false, new x15(this, str, (byte) 21));
    }

    public static yo8 c(int i, TLRPC.UserFull userFull, yo8 yo8Var) {
        int i2;
        TL_account.TL_birthday tL_birthday;
        if (e66.e(2) && oj0.d(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i2 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i2 = 0;
            }
            if (yo8Var != null) {
                if (yo8Var.a == i2) {
                    return yo8Var;
                }
                yo8Var.b(false);
            }
            return new yo8(i, i2);
        } else if (yo8Var != null) {
            yo8Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.b && this.f.size() >= this.e.size()) {
            boolean[] zArr = this.g;
            int i = 0;
            if (zArr[0] && zArr[1]) {
                this.b = true;
                ArrayList arrayList = this.h;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
            }
        }
    }

    public final void b(boolean z) {
        if (!z && !this.j.isEmpty()) {
            this.i = true;
            return;
        }
        this.h.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                ((ap8) arrayList.get(i)).K();
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
