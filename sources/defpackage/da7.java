package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
public final class da7 {
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int a = 0;
    public final int[] g = new int[6];
    public final int[] h = new int[6];

    public static da7 a(TLRPC.EmojiStatus emojiStatus) {
        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
            return null;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
        da7 da7Var = new da7();
        da7Var.c = -1;
        da7Var.d = true;
        int i = tL_emojiStatusCollectible.edge_color | (-16777216);
        int[] iArr = da7Var.g;
        iArr[0] = i;
        int i2 = tL_emojiStatusCollectible.center_color | (-16777216);
        iArr[1] = i2;
        iArr[2] = i;
        iArr[3] = i2;
        int i3 = tL_emojiStatusCollectible.text_color | (-16777216);
        iArr[4] = i3;
        iArr[5] = i3;
        System.arraycopy(iArr, 0, da7Var.h, 0, 6);
        da7Var.a = tL_emojiStatusCollectible.pattern_color | (-16777216);
        return da7Var;
    }

    public static da7 b(TLRPC.TL_help_peerColorOption tL_help_peerColorOption) {
        if (tL_help_peerColorOption == null) {
            return null;
        }
        da7 da7Var = new da7();
        da7Var.c = tL_help_peerColorOption.color_id;
        da7Var.d = tL_help_peerColorOption.hidden;
        int i = tL_help_peerColorOption.flags;
        if ((i & 8) != 0) {
            da7Var.e = tL_help_peerColorOption.channel_min_level;
        }
        if ((i & 16) != 0) {
            da7Var.f = tL_help_peerColorOption.group_min_level;
        }
        System.arraycopy(p(tL_help_peerColorOption.colors), 0, da7Var.g, 0, 6);
        System.arraycopy(p(tL_help_peerColorOption.dark_colors), 0, da7Var.h, 0, 6);
        return da7Var;
    }

    public static int[] p(TLRPC.help_PeerColorSet help_peercolorset) {
        ArrayList<Integer> arrayList;
        int[] iArr = new int[6];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        if (help_peercolorset instanceof TLRPC.TL_help_peerColorSet) {
            arrayList = ((TLRPC.TL_help_peerColorSet) help_peercolorset).colors;
        } else if (help_peercolorset instanceof TLRPC.TL_help_peerColorProfileSet) {
            TLRPC.TL_help_peerColorProfileSet tL_help_peerColorProfileSet = (TLRPC.TL_help_peerColorProfileSet) help_peercolorset;
            ArrayList<Integer> arrayList2 = tL_help_peerColorProfileSet.palette_colors;
            ArrayList<Integer> arrayList3 = tL_help_peerColorProfileSet.bg_colors;
            ArrayList<Integer> arrayList4 = tL_help_peerColorProfileSet.story_colors;
            ArrayList<Integer> arrayList5 = new ArrayList<>();
            if (arrayList2 != null) {
                for (int i = 0; i < Math.min(2, arrayList2.size()); i++) {
                    arrayList5.add(arrayList2.get(i));
                }
            }
            if (arrayList3 != null) {
                for (int i2 = 0; i2 < Math.min(2, arrayList3.size()); i2++) {
                    arrayList5.add(arrayList3.get(i2));
                }
            }
            if (arrayList4 != null) {
                for (int i3 = 0; i3 < Math.min(2, arrayList4.size()); i3++) {
                    arrayList5.add(arrayList4.get(i3));
                }
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                Arrays.fill(iArr, arrayList.get(0).intValue() | (-16777216));
            }
            for (int i4 = 0; i4 < Math.min(6, arrayList.size()); i4++) {
                iArr[i4] = arrayList.get(i4).intValue() | (-16777216);
            }
        }
        return iArr;
    }

    public final int c(boolean z) {
        if (o(z)) {
            return j(z);
        }
        return h(z);
    }

    public final int d(boolean z) {
        int[] iArr;
        if (o(z)) {
            if (z) {
                iArr = this.h;
            } else {
                iArr = this.g;
            }
            return iArr[3];
        }
        return h(z);
    }

    public final int e(int i, wjb wjbVar) {
        boolean o;
        int[] iArr;
        int i2;
        if (i >= 0 && i <= 5) {
            if (this.b && (i2 = this.c) >= 0 && i2 < 7) {
                return bkb.v0(bkb.q8[i2], wjbVar);
            }
            if (wjbVar != null) {
                o = wjbVar.a();
            } else {
                o = bkb.I.o();
            }
            if (o) {
                iArr = this.h;
            } else {
                iArr = this.g;
            }
            return iArr[i];
        }
        return 0;
    }

    public final int f() {
        int[] iArr;
        if (bkb.I.o()) {
            iArr = this.h;
        } else {
            iArr = this.g;
        }
        return iArr[0];
    }

    public final int g() {
        int[] iArr;
        if (bkb.I.o()) {
            iArr = this.h;
        } else {
            iArr = this.g;
        }
        return iArr[1];
    }

    public final int h(boolean z) {
        int[] iArr;
        if (z) {
            iArr = this.h;
        } else {
            iArr = this.g;
        }
        return iArr[1];
    }

    public final int i() {
        int[] iArr;
        if (bkb.I.o()) {
            iArr = this.h;
        } else {
            iArr = this.g;
        }
        return iArr[2];
    }

    public final int j(boolean z) {
        int[] iArr;
        if (z) {
            iArr = this.h;
        } else {
            iArr = this.g;
        }
        return iArr[2];
    }

    public final int k() {
        int[] iArr;
        if (bkb.I.o()) {
            iArr = this.h;
        } else {
            iArr = this.g;
        }
        return iArr[4];
    }

    public final int l(boolean z) {
        if (z) {
            return this.f;
        }
        return this.e;
    }

    public final int m(boolean z) {
        int[] iArr;
        if (o(z)) {
            if (z) {
                iArr = this.h;
            } else {
                iArr = this.g;
            }
            return iArr[4];
        }
        return j(z);
    }

    public final int n(boolean z) {
        boolean o = o(z);
        int[] iArr = this.g;
        int[] iArr2 = this.h;
        if (o) {
            if (z) {
                iArr = iArr2;
            }
            return iArr[5];
        }
        if (z) {
            iArr = iArr2;
        }
        return iArr[3];
    }

    public final boolean o(boolean z) {
        int[] iArr;
        int[] iArr2 = this.g;
        int[] iArr3 = this.h;
        if (z) {
            iArr = iArr3;
        } else {
            iArr = iArr2;
        }
        int i = iArr[5];
        if (z) {
            iArr2 = iArr3;
        }
        if (i == iArr2[0]) {
            return false;
        }
        return true;
    }
}
