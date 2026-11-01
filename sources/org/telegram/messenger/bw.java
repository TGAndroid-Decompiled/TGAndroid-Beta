package org.telegram.messenger;

import java.math.BigInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public abstract class bw {
    public static byte[] a(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr = new byte[256];
            System.arraycopy(byteArray, 1, bArr, 0, 256);
            return bArr;
        } else if (byteArray.length < 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 0, bArr2, 256 - byteArray.length, byteArray.length);
            for (int i10 = 0; i10 < 256 - byteArray.length; i10++) {
                bArr2[i10] = 0;
            }
            return bArr2;
        } else {
            return byteArray;
        }
    }

    public static byte[] b(byte[] bArr, TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f19923p;
        int i10 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f19922g;
        Pattern pattern = Utilities.f14519a;
        if (!ConnectionsManager.native_isGoodPrime(bArr2, i10)) {
            return null;
        }
        BigInteger valueOf = BigInteger.valueOf(tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f19922g);
        a(valueOf);
        return a(valueOf.modPow(new BigInteger(1, c(bArr, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)), new BigInteger(1, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f19923p)));
    }

    public static byte[] c(byte[] bArr, TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        byte[] bArr2 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1;
        byte[] q6 = Utilities.q(bArr2, bArr, bArr2);
        byte[] bArr3 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt2;
        byte[] m10 = Utilities.m(Utilities.q(bArr3, q6, bArr3), tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1);
        byte[] bArr4 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt2;
        return Utilities.q(bArr4, m10, bArr4);
    }

    public static TLRPC.TL_inputCheckPasswordSRP d(byte[] bArr, long j10, byte[] bArr2, TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        byte[] a2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        if (bArr != null && bArr2 != null && bArr2.length != 0) {
            byte[] bArr6 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f19923p;
            int i10 = tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f19922g;
            Pattern pattern = Utilities.f14519a;
            if (ConnectionsManager.native_isGoodPrime(bArr6, i10)) {
                BigInteger valueOf = BigInteger.valueOf(tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f19922g);
                byte[] a10 = a(valueOf);
                BigInteger bigInteger = new BigInteger(1, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f19923p);
                BigInteger bigInteger2 = new BigInteger(1, Utilities.q(tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f19923p, a10));
                BigInteger bigInteger3 = new BigInteger(1, bArr);
                byte[] bArr7 = new byte[256];
                Utilities.f14520b.nextBytes(bArr7);
                BigInteger bigInteger4 = new BigInteger(1, bArr7);
                byte[] a11 = a(valueOf.modPow(bigInteger4, bigInteger));
                BigInteger bigInteger5 = new BigInteger(1, bArr2);
                BigInteger bigInteger6 = BigInteger.ZERO;
                if (bigInteger5.compareTo(bigInteger6) > 0 && bigInteger5.compareTo(bigInteger) < 0) {
                    byte[] a12 = a(bigInteger5);
                    BigInteger bigInteger7 = new BigInteger(1, Utilities.q(a11, a12));
                    if (bigInteger7.compareTo(bigInteger6) != 0) {
                        BigInteger subtract = bigInteger5.subtract(bigInteger2.multiply(valueOf.modPow(bigInteger3, bigInteger)).mod(bigInteger));
                        if (subtract.compareTo(bigInteger6) < 0) {
                            subtract = subtract.add(bigInteger);
                        }
                        if (Utilities.w(subtract, bigInteger)) {
                            byte[] o10 = Utilities.o(a2.length, a(subtract.modPow(bigInteger4.add(bigInteger7.multiply(bigInteger3)), bigInteger)));
                            byte[] o11 = Utilities.o(bArr3.length, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.f19923p);
                            byte[] o12 = Utilities.o(a10.length, a10);
                            for (int i11 = 0; i11 < o11.length; i11++) {
                                o11[i11] = (byte) (o12[i11] ^ o11[i11]);
                            }
                            TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordSRP();
                            tL_inputCheckPasswordSRP.M1 = Utilities.q(o11, Utilities.o(bArr4.length, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt1), Utilities.o(bArr5.length, tL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow.salt2), a11, a12, o10);
                            tL_inputCheckPasswordSRP.A = a11;
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
