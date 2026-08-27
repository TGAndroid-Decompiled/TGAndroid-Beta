package dg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class a extends xf.a {

    public CharSequence f4923c;
    public TLRPC.InputPeer d;

    public TLRPC.Chat f4924e;

    public Object f4925f;

    public boolean f4926g;
    public long h;

    public int f4927i;

    public int f4928j;

    public List f4929k;

    public int f4930l;

    public TLObject f4931m;

    public static a b(TLRPC.Chat chat, int i10, boolean z10) {
        a aVar = new a(9, false);
        aVar.f4924e = chat;
        aVar.d = null;
        aVar.f4926g = z10;
        aVar.f4927i = i10;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        a aVar = new a(7, false);
        aVar.f4923c = charSequence;
        aVar.f4926g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z10, boolean z11) {
        a aVar = new a(17, z10);
        aVar.f4927i = i10;
        aVar.h = j10;
        aVar.f4931m = tL_starsGiveawayOption;
        aVar.f4926g = z11;
        return aVar;
    }

    public static a e(int i10, int i11, boolean z10, ArrayList arrayList) {
        a aVar = new a(11, i11 == i10);
        aVar.f4930l = i10;
        aVar.f4926g = z10;
        aVar.f4925f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        a aVar = new a(6, false);
        aVar.f4923c = str;
        return aVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((Integer) list.get(i10)).intValue() != ((Integer) list2.get(i10)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean a(xf.a aVar) {
        a aVar2;
        int i10;
        int i11;
        if (this == aVar) {
            return true;
        }
        if (a.class != aVar.getClass() || (i10 = (aVar2 = (a) aVar).f49413a) != (i11 = this.f49413a)) {
            return false;
        }
        if (i11 == 0) {
            return this.f4926g == aVar2.f4926g;
        }
        if (i10 == 17) {
            return this.f4927i == aVar2.f4927i && this.h == aVar2.h && this.f4931m == aVar2.f4931m && this.f4926g == aVar2.f4926g && this.f49414b == aVar2.f49414b;
        }
        if (i11 == 5) {
            return this.f4927i == aVar2.f4927i && g(this.f4929k, aVar2.f4929k);
        }
        return i11 == 13 && this.f4927i == aVar2.f4927i && TextUtils.equals(this.f4923c, aVar2.f4923c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = this.f49413a;
        if (i10 != aVar.f49413a) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        if (i10 == 17) {
            return this.f4927i == aVar.f4927i && this.f4931m == aVar.f4931m;
        }
        if (i10 == 5) {
            return g(this.f4929k, aVar.f4929k);
        }
        if (i10 == 13) {
            return TextUtils.equals(this.f4923c, aVar.f4923c);
        }
        return this.f4924e == aVar.f4924e && this.f4925f == aVar.f4925f && this.d == aVar.d && this.f4931m == aVar.f4931m && this.f4926g == aVar.f4926g && this.f4927i == aVar.f4927i && this.f4928j == aVar.f4928j && this.h == aVar.h && this.f4930l == aVar.f4930l && TextUtils.equals(this.f4923c, aVar.f4923c);
    }
}
