package org.telegram.messenger;

import java.math.BigInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public abstract class hv {
    public static byte[] a(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr = new byte[256];
            System.arraycopy(byteArray, 1, bArr, 0, 256);
            return bArr;
        } else if (byteArray.length < 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 0, bArr2, 256 - byteArray.length, byteArray.length);
            for (int i3 = 0; i3 < 256 - byteArray.length; i3++) {
                bArr2[i3] = 0;
            }
            return bArr2;
        } else {
            return byteArray;
        }
    }

    public static byte[] b(byte[] bArr, TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f27130p;
        int i3 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f27129g;
        Pattern pattern = Utilities.f21384a;
        if (!ConnectionsManager.native_isGoodPrime(bArr2, i3)) {
            return null;
        }
        BigInteger valueOf = BigInteger.valueOf(tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f27129g);
        a(valueOf);
        return a(valueOf.modPow(new BigInteger(1, c(bArr, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)), new BigInteger(1, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f27130p)));
    }

    public static byte[] c(byte[] bArr, TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
        byte[] q10 = Utilities.q(bArr2, bArr, bArr2);
        byte[] bArr3 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt2;
        byte[] m10 = Utilities.m(Utilities.q(bArr3, q10, bArr3), tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1);
        byte[] bArr4 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt2;
        return Utilities.q(bArr4, m10, bArr4);
    }

    public static TLRPC.TL_inputCheckPasswordSRP d(byte[] bArr, long j10, byte[] bArr2, TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        byte[] a10;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        if (bArr != null && bArr2 != null && bArr2.length != 0) {
            byte[] bArr6 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f27130p;
            int i3 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f27129g;
            Pattern pattern = Utilities.f21384a;
            if (ConnectionsManager.native_isGoodPrime(bArr6, i3)) {
                BigInteger valueOf = BigInteger.valueOf(tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f27129g);
                byte[] a11 = a(valueOf);
                BigInteger bigInteger = new BigInteger(1, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f27130p);
                BigInteger bigInteger2 = new BigInteger(1, Utilities.q(tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f27130p, a11));
                BigInteger bigInteger3 = new BigInteger(1, bArr);
                byte[] bArr7 = new byte[256];
                Utilities.f21385b.nextBytes(bArr7);
                BigInteger bigInteger4 = new BigInteger(1, bArr7);
                byte[] a12 = a(valueOf.modPow(bigInteger4, bigInteger));
                BigInteger bigInteger5 = new BigInteger(1, bArr2);
                BigInteger bigInteger6 = BigInteger.ZERO;
                if (bigInteger5.compareTo(bigInteger6) > 0 && bigInteger5.compareTo(bigInteger) < 0) {
                    byte[] a13 = a(bigInteger5);
                    BigInteger bigInteger7 = new BigInteger(1, Utilities.q(a12, a13));
                    if (bigInteger7.compareTo(bigInteger6) != 0) {
                        BigInteger subtract = bigInteger5.subtract(bigInteger2.multiply(valueOf.modPow(bigInteger3, bigInteger)).mod(bigInteger));
                        if (subtract.compareTo(bigInteger6) < 0) {
                            subtract = subtract.add(bigInteger);
                        }
                        if (Utilities.w(subtract, bigInteger)) {
                            byte[] o10 = Utilities.o(a10.length, a(subtract.modPow(bigInteger4.add(bigInteger7.multiply(bigInteger3)), bigInteger)));
                            byte[] o11 = Utilities.o(bArr3.length, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f27130p);
                            byte[] o12 = Utilities.o(a11.length, a11);
                            for (int i10 = 0; i10 < o11.length; i10++) {
                                o11[i10] = (byte) (o12[i10] ^ o11[i10]);
                            }
                            TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordSRP();
                            tL_inputCheckPasswordSRP.M1 = Utilities.q(o11, Utilities.o(bArr4.length, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1), Utilities.o(bArr5.length, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt2), a12, a13, o10);
                            tL_inputCheckPasswordSRP.A = a12;
                            tL_inputCheckPasswordSRP.srp_id = j10;
                            return tL_inputCheckPasswordSRP;
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
