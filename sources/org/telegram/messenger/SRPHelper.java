package org.telegram.messenger;

import java.math.BigInteger;
import org.telegram.tgnet.C1068x72c667f;
import org.telegram.tgnet.TLRPC$TL_inputCheckPasswordSRP;

public class SRPHelper {
    public static byte[] getBigIntegerBytes(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr = new byte[256];
            System.arraycopy(byteArray, 1, bArr, 0, 256);
            return bArr;
        } else if (byteArray.length < 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 0, bArr2, 256 - byteArray.length, byteArray.length);
            for (int i = 0; i < 256 - byteArray.length; i++) {
                bArr2[i] = 0;
            }
            return bArr2;
        } else {
            return byteArray;
        }
    }

    public static byte[] getX(byte[] bArr, C1068x72c667f c1068x72c667f) {
        byte[] bArr2 = c1068x72c667f.salt1;
        byte[] computeSHA256 = Utilities.computeSHA256(bArr2, bArr, bArr2);
        byte[] bArr3 = c1068x72c667f.salt2;
        byte[] computePBKDF2 = Utilities.computePBKDF2(Utilities.computeSHA256(bArr3, computeSHA256, bArr3), c1068x72c667f.salt1);
        byte[] bArr4 = c1068x72c667f.salt2;
        return Utilities.computeSHA256(bArr4, computePBKDF2, bArr4);
    }

    public static BigInteger getV(byte[] bArr, C1068x72c667f c1068x72c667f) {
        BigInteger valueOf = BigInteger.valueOf(c1068x72c667f.f966g);
        getBigIntegerBytes(valueOf);
        return valueOf.modPow(new BigInteger(1, getX(bArr, c1068x72c667f)), new BigInteger(1, c1068x72c667f.f967p));
    }

    public static byte[] getVBytes(byte[] bArr, C1068x72c667f c1068x72c667f) {
        if (Utilities.isGoodPrime(c1068x72c667f.f967p, c1068x72c667f.f966g)) {
            return getBigIntegerBytes(getV(bArr, c1068x72c667f));
        }
        return null;
    }

    public static TLRPC$TL_inputCheckPasswordSRP startCheck(byte[] bArr, long j, byte[] bArr2, C1068x72c667f c1068x72c667f) {
        if (bArr != null && bArr2 != null && bArr2.length != 0 && Utilities.isGoodPrime(c1068x72c667f.f967p, c1068x72c667f.f966g)) {
            BigInteger valueOf = BigInteger.valueOf(c1068x72c667f.f966g);
            byte[] bigIntegerBytes = getBigIntegerBytes(valueOf);
            BigInteger bigInteger = new BigInteger(1, c1068x72c667f.f967p);
            BigInteger bigInteger2 = new BigInteger(1, Utilities.computeSHA256(c1068x72c667f.f967p, bigIntegerBytes));
            BigInteger bigInteger3 = new BigInteger(1, bArr);
            byte[] bArr3 = new byte[256];
            Utilities.random.nextBytes(bArr3);
            BigInteger bigInteger4 = new BigInteger(1, bArr3);
            byte[] bigIntegerBytes2 = getBigIntegerBytes(valueOf.modPow(bigInteger4, bigInteger));
            BigInteger bigInteger5 = new BigInteger(1, bArr2);
            BigInteger bigInteger6 = BigInteger.ZERO;
            if (bigInteger5.compareTo(bigInteger6) > 0 && bigInteger5.compareTo(bigInteger) < 0) {
                byte[] bigIntegerBytes3 = getBigIntegerBytes(bigInteger5);
                BigInteger bigInteger7 = new BigInteger(1, Utilities.computeSHA256(bigIntegerBytes2, bigIntegerBytes3));
                if (bigInteger7.compareTo(bigInteger6) == 0) {
                    return null;
                }
                BigInteger subtract = bigInteger5.subtract(bigInteger2.multiply(valueOf.modPow(bigInteger3, bigInteger)).mod(bigInteger));
                if (subtract.compareTo(bigInteger6) < 0) {
                    subtract = subtract.add(bigInteger);
                }
                if (Utilities.isGoodGaAndGb(subtract, bigInteger)) {
                    byte[] computeSHA256 = Utilities.computeSHA256(getBigIntegerBytes(subtract.modPow(bigInteger4.add(bigInteger7.multiply(bigInteger3)), bigInteger)));
                    byte[] computeSHA2562 = Utilities.computeSHA256(c1068x72c667f.f967p);
                    byte[] computeSHA2563 = Utilities.computeSHA256(bigIntegerBytes);
                    for (int i = 0; i < computeSHA2562.length; i++) {
                        computeSHA2562[i] = (byte) (computeSHA2563[i] ^ computeSHA2562[i]);
                    }
                    TLRPC$TL_inputCheckPasswordSRP tLRPC$TL_inputCheckPasswordSRP = new TLRPC$TL_inputCheckPasswordSRP();
                    tLRPC$TL_inputCheckPasswordSRP.f909M1 = Utilities.computeSHA256(computeSHA2562, Utilities.computeSHA256(c1068x72c667f.salt1), Utilities.computeSHA256(c1068x72c667f.salt2), bigIntegerBytes2, bigIntegerBytes3, computeSHA256);
                    tLRPC$TL_inputCheckPasswordSRP.f908A = bigIntegerBytes2;
                    tLRPC$TL_inputCheckPasswordSRP.srp_id = j;
                    return tLRPC$TL_inputCheckPasswordSRP;
                }
                return null;
            }
        }
        return null;
    }
}
