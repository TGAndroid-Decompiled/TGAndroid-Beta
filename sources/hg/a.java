package hg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a extends bg.b {
    public CharSequence f7067c;
    public TLRPC.InputPeer d;
    public TLRPC.Chat e;
    public Object f7068f;
    public boolean f7069g;
    public long h;
    public int f7070i;
    public int f7071j;
    public List f7072k;
    public int f7073l;
    public TLObject f7074m;

    public static a b(TLRPC.Chat chat, int i10, boolean z4) {
        ?? bVar = new bg.b(9, false);
        bVar.e = chat;
        bVar.d = null;
        bVar.f7069g = z4;
        bVar.f7070i = i10;
        return bVar;
    }

    public static a c(CharSequence charSequence, boolean z4) {
        ?? bVar = new bg.b(7, false);
        bVar.f7067c = charSequence;
        bVar.f7069g = z4;
        return bVar;
    }

    public static a d(TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption, int i10, long j10, boolean z4, boolean z10) {
        ?? bVar = new bg.b(17, z4);
        bVar.f7070i = i10;
        bVar.h = j10;
        bVar.f7074m = tL_starsGiveawayOption;
        bVar.f7069g = z10;
        return bVar;
    }

    public static a e(int i10, int i11, boolean z4, ArrayList arrayList) {
        boolean z10;
        if (i11 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ?? bVar = new bg.b(11, z10);
        bVar.f7073l = i10;
        bVar.f7069g = z4;
        bVar.f7068f = arrayList;
        return bVar;
    }

    public static a f(String str) {
        ?? bVar = new bg.b(6, false);
        bVar.f7067c = str;
        return bVar;
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
    public final boolean a(bg.b bVar) {
        a aVar;
        int i10;
        int i11;
        if (this != bVar) {
            if (a.class == bVar.getClass() && (i10 = (aVar = (a) bVar).f1808a) == (i11 = this.f1808a)) {
                if (i11 == 0) {
                    if (this.f7069g == aVar.f7069g) {
                        return true;
                    }
                    return false;
                } else if (i10 == 17) {
                    if (this.f7070i == aVar.f7070i && this.h == aVar.h && this.f7074m == aVar.f7074m && this.f7069g == aVar.f7069g && this.f1809b == aVar.f1809b) {
                        return true;
                    }
                    return false;
                } else if (i11 == 5) {
                    if (this.f7070i == aVar.f7070i && g(this.f7072k, aVar.f7072k)) {
                        return true;
                    }
                    return false;
                } else if (i11 == 13 && this.f7070i == aVar.f7070i && TextUtils.equals(this.f7067c, aVar.f7067c)) {
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
                int i10 = this.f1808a;
                if (i10 == aVar.f1808a) {
                    if (i10 != 0) {
                        if (i10 == 17) {
                            if (this.f7070i == aVar.f7070i && this.f7074m == aVar.f7074m) {
                                return true;
                            }
                            return false;
                        } else if (i10 == 5) {
                            return g(this.f7072k, aVar.f7072k);
                        } else {
                            if (i10 == 13) {
                                return TextUtils.equals(this.f7067c, aVar.f7067c);
                            }
                            if (this.e == aVar.e && this.f7068f == aVar.f7068f && this.d == aVar.d && this.f7074m == aVar.f7074m && this.f7069g == aVar.f7069g && this.f7070i == aVar.f7070i && this.f7071j == aVar.f7071j && this.h == aVar.h && this.f7073l == aVar.f7073l && TextUtils.equals(this.f7067c, aVar.f7067c)) {
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
