package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class xn8 extends zde {
    public int a;
    public final SparseIntArray b = new SparseIntArray();
    public final SparseIntArray c = new SparseIntArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f;
    public int g;
    public final ProfileActivity h;

    public xn8(ProfileActivity profileActivity) {
        this.h = profileActivity;
    }

    public static void f(int i, int i2, SparseIntArray sparseIntArray) {
        if (i2 >= 0) {
            sparseIntArray.put(i2, i);
        }
    }

    @Override
    public final boolean a(int i, int i2) {
        return b(i, i2);
    }

    @Override
    public final boolean b(int i, int i2) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatParticipant chatParticipant2;
        ProfileActivity profileActivity = this.h;
        if (i2 >= profileActivity.x4 && i2 < profileActivity.y4 && i >= this.f && i < this.g) {
            ArrayList arrayList = this.e;
            boolean isEmpty = arrayList.isEmpty();
            int i3 = this.f;
            ArrayList arrayList2 = this.d;
            int i4 = i - i3;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i4)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i4);
            }
            boolean isEmpty2 = profileActivity.D2.isEmpty();
            ArrayList arrayList3 = profileActivity.U4;
            if (!isEmpty2) {
                chatParticipant2 = (TLRPC.ChatParticipant) arrayList3.get(((Integer) profileActivity.V4.get(i2 - profileActivity.x4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) arrayList3.get(i2 - profileActivity.x4);
            }
            if (chatParticipant.user_id == chatParticipant2.user_id) {
                return true;
            }
            return false;
        }
        int i5 = this.b.get(i, -1);
        if (i5 == this.c.get(i2, -1) && i5 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int c() {
        return this.h.O2;
    }

    @Override
    public final int d() {
        return this.a;
    }

    public final void e(SparseIntArray sparseIntArray) {
        int i;
        int i2;
        int i3;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.h;
        f(1, profileActivity.P2, sparseIntArray);
        f(2, profileActivity.Q2, sparseIntArray);
        f(3, profileActivity.T2, sparseIntArray);
        f(4, profileActivity.U2, sparseIntArray);
        f(5, profileActivity.W2, sparseIntArray);
        f(6, profileActivity.X2, sparseIntArray);
        f(7, profileActivity.b3, sparseIntArray);
        f(8, profileActivity.Y2, sparseIntArray);
        f(9, profileActivity.d3, sparseIntArray);
        f(10, profileActivity.c3, sparseIntArray);
        f(11, profileActivity.Z2, sparseIntArray);
        f(12, profileActivity.a3, sparseIntArray);
        f(13, profileActivity.e3, sparseIntArray);
        f(14, profileActivity.f3, sparseIntArray);
        f(15, profileActivity.g3, sparseIntArray);
        f(16, profileActivity.h3, sparseIntArray);
        f(17, profileActivity.f4, sparseIntArray);
        f(18, profileActivity.g4, sparseIntArray);
        f(19, profileActivity.i4, sparseIntArray);
        f(20, profileActivity.k4, sparseIntArray);
        f(21, profileActivity.j4, sparseIntArray);
        f(22, profileActivity.i3, sparseIntArray);
        f(23, profileActivity.j3, sparseIntArray);
        f(24, profileActivity.m3, sparseIntArray);
        f(25, profileActivity.k3, sparseIntArray);
        f(26, profileActivity.l3, sparseIntArray);
        f(27, profileActivity.n3, sparseIntArray);
        f(28, profileActivity.o3, sparseIntArray);
        f(29, profileActivity.p3, sparseIntArray);
        f(30, profileActivity.q3, sparseIntArray);
        f(31, profileActivity.r3, sparseIntArray);
        f(32, profileActivity.s3, sparseIntArray);
        f(33, profileActivity.t3, sparseIntArray);
        f(34, profileActivity.u3, sparseIntArray);
        f(35, profileActivity.v3, sparseIntArray);
        f(36, profileActivity.w3, sparseIntArray);
        f(37, profileActivity.x3, sparseIntArray);
        f(38, profileActivity.y3, sparseIntArray);
        f(39, profileActivity.z3, sparseIntArray);
        f(40, profileActivity.A3, sparseIntArray);
        f(41, profileActivity.B3, sparseIntArray);
        f(42, profileActivity.C3, sparseIntArray);
        f(43, profileActivity.D3, sparseIntArray);
        f(44, profileActivity.E3, sparseIntArray);
        f(45, profileActivity.F3, sparseIntArray);
        f(46, profileActivity.G3, sparseIntArray);
        f(47, profileActivity.H3, sparseIntArray);
        f(48, profileActivity.I3, sparseIntArray);
        f(49, profileActivity.J3, sparseIntArray);
        f(50, profileActivity.K3, sparseIntArray);
        f(51, profileActivity.L3, sparseIntArray);
        f(52, profileActivity.M3, sparseIntArray);
        f(53, profileActivity.N3, sparseIntArray);
        f(54, profileActivity.Z3, sparseIntArray);
        f(55, profileActivity.O3, sparseIntArray);
        f(56, profileActivity.S3, sparseIntArray);
        f(57, profileActivity.T3, sparseIntArray);
        f(58, profileActivity.U3, sparseIntArray);
        f(59, profileActivity.m4, sparseIntArray);
        f(60, profileActivity.V3, sparseIntArray);
        f(61, profileActivity.W3, sparseIntArray);
        f(62, profileActivity.X3, sparseIntArray);
        f(63, profileActivity.Y3, sparseIntArray);
        f(64, profileActivity.a4, sparseIntArray);
        f(65, profileActivity.t4, sparseIntArray);
        f(66, profileActivity.u4, sparseIntArray);
        f(67, profileActivity.v4, sparseIntArray);
        f(68, profileActivity.w4, sparseIntArray);
        f(69, profileActivity.z4, sparseIntArray);
        f(70, profileActivity.A4, sparseIntArray);
        f(71, profileActivity.B4, sparseIntArray);
        f(72, profileActivity.C4, sparseIntArray);
        f(73, profileActivity.D4, sparseIntArray);
        f(74, profileActivity.J4, sparseIntArray);
        f(75, profileActivity.K4, sparseIntArray);
        f(76, profileActivity.H4, sparseIntArray);
        f(77, profileActivity.N4, sparseIntArray);
        f(78, profileActivity.O4, sparseIntArray);
        f(79, profileActivity.b4, sparseIntArray);
        f(80, profileActivity.c4, sparseIntArray);
        f(81, profileActivity.d4, sparseIntArray);
        f(82, profileActivity.e4, sparseIntArray);
        f(83, profileActivity.P4, sparseIntArray);
        f(84, profileActivity.Q4, sparseIntArray);
        f(85, profileActivity.R3, sparseIntArray);
        f(86, profileActivity.P3, sparseIntArray);
        f(87, profileActivity.Q3, sparseIntArray);
        f(88, profileActivity.V2, sparseIntArray);
        f(89, profileActivity.R2, sparseIntArray);
        f(90, profileActivity.E4, sparseIntArray);
        f(91, profileActivity.F4, sparseIntArray);
        f(92, profileActivity.G4, sparseIntArray);
        f(93, profileActivity.I4, sparseIntArray);
        f(94, profileActivity.l4, sparseIntArray);
        f(95, profileActivity.q4, sparseIntArray);
        i = profileActivity.botPermissionLocation;
        f(96, i, sparseIntArray);
        i2 = profileActivity.botPermissionEmojiStatus;
        f(97, i2, sparseIntArray);
        i3 = profileActivity.botPermissionBiometry;
        f(98, i3, sparseIntArray);
        f(99, profileActivity.s4, sparseIntArray);
        f(100, profileActivity.S2, sparseIntArray);
        f(101, profileActivity.n4, sparseIntArray);
        f(102, profileActivity.o4, sparseIntArray);
        f(103, profileActivity.p4, sparseIntArray);
    }
}
