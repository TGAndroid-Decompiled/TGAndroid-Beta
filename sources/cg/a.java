package cg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends wf.a {
    public CharSequence f2379c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat f2380e;
    public Object f2381f;
    public boolean f2382g;
    public long h;
    public int f2383i;
    public int f2384j;
    public List f2385k;
    public int f2386l;
    public TLObject f2387m;

    public static a b(TLRPC.Chat chat, int i9, boolean z10) {
        ?? aVar = new wf.a(9, false);
        aVar.f2380e = chat;
        aVar.d = null;
        aVar.f2382g = z10;
        aVar.f2383i = i9;
        return aVar;
    }

    public static a c(CharSequence charSequence, boolean z10) {
        ?? aVar = new wf.a(7, false);
        aVar.f2379c = charSequence;
        aVar.f2382g = z10;
        return aVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i9, long j10, boolean z10, boolean z11) {
        ?? aVar = new wf.a(17, z10);
        aVar.f2383i = i9;
        aVar.h = j10;
        aVar.f2387m = tL_starsGiveawayOption;
        aVar.f2382g = z11;
        return aVar;
    }

    public static a e(int i9, int i10, boolean z10, ArrayList arrayList) {
        boolean z11;
        if (i10 == i9) {
            z11 = true;
        } else {
            z11 = false;
        }
        ?? aVar = new wf.a(11, z11);
        aVar.f2386l = i9;
        aVar.f2382g = z10;
        aVar.f2381f = arrayList;
        return aVar;
    }

    public static a f(String str) {
        ?? aVar = new wf.a(6, false);
        aVar.f2379c = str;
        return aVar;
    }

    public static boolean g(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (((Integer) list.get(i9)).intValue() != ((Integer) list2.get(i9)).intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean a(wf.a aVar) {
        a aVar2;
        int i9;
        int i10;
        if (this != aVar) {
            if (a.class == aVar.getClass() && (i9 = (aVar2 = (a) aVar).f48814a) == (i10 = this.f48814a)) {
                if (i10 == 0) {
                    if (this.f2382g == aVar2.f2382g) {
                        return true;
                    }
                    return false;
                } else if (i9 == 17) {
                    if (this.f2383i == aVar2.f2383i && this.h == aVar2.h && this.f2387m == aVar2.f2387m && this.f2382g == aVar2.f2382g && this.f48815b == aVar2.f48815b) {
                        return true;
                    }
                    return false;
                } else if (i10 == 5) {
                    if (this.f2383i == aVar2.f2383i && g(this.f2385k, aVar2.f2385k)) {
                        return true;
                    }
                    return false;
                } else if (i10 == 13 && this.f2383i == aVar2.f2383i && TextUtils.equals(this.f2379c, aVar2.f2379c)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                int i9 = this.f48814a;
                if (i9 == aVar.f48814a) {
                    if (i9 != 0) {
                        if (i9 == 17) {
                            if (this.f2383i == aVar.f2383i && this.f2387m == aVar.f2387m) {
                                return true;
                            }
                            return false;
                        } else if (i9 == 5) {
                            return g(this.f2385k, aVar.f2385k);
                        } else {
                            if (i9 == 13) {
                                return TextUtils.equals(this.f2379c, aVar.f2379c);
                            }
                            if (this.f2380e == aVar.f2380e && this.f2381f == aVar.f2381f && this.d == aVar.d && this.f2387m == aVar.f2387m && this.f2382g == aVar.f2382g && this.f2383i == aVar.f2383i && this.f2384j == aVar.f2384j && this.h == aVar.h && this.f2386l == aVar.f2386l && TextUtils.equals(this.f2379c, aVar.f2379c)) {
                                return true;
                            }
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
