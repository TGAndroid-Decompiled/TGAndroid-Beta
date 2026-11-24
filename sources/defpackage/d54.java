package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
public final class d54 {
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final a54 H;
    public static final a54[][] I;
    public static final a54[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final HashSet M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);
    public static final List n = Arrays.asList(1, 6, 3, 8);
    public static final List o = Arrays.asList(2, 7, 4, 5);
    public static final int[] p = {8, 8, 8};
    public static final int[] q = {8};
    public static final byte[] r = {-1, -40, -1};
    public static final byte[] s = {102, 116, 121, 112};
    public static final byte[] t = {109, 105, 102, 49};
    public static final byte[] u = {104, 101, 105, 99};
    public static final byte[] v = {79, 76, 89, 77, 80, 0};
    public static final byte[] w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] x = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] y = {101, 88, 73, 102};
    public static final byte[] z = {73, 72, 68, 82};
    public static final byte[] A = {73, 69, 78, 68};
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};

    static {
        a54[] a54VarArr;
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        a54[] a54VarArr2 = {new a54("NewSubfileType", 254, 4), new a54("SubfileType", 255, 4), new a54(256, 3, 4, "ImageWidth"), new a54(257, 3, 4, "ImageLength"), new a54("BitsPerSample", 258, 3), new a54("Compression", 259, 3), new a54("PhotometricInterpretation", 262, 3), new a54("ImageDescription", 270, 2), new a54("Make", 271, 2), new a54("Model", 272, 2), new a54(273, 3, 4, "StripOffsets"), new a54("Orientation", 274, 3), new a54("SamplesPerPixel", 277, 3), new a54(278, 3, 4, "RowsPerStrip"), new a54(279, 3, 4, "StripByteCounts"), new a54("XResolution", 282, 5), new a54("YResolution", 283, 5), new a54("PlanarConfiguration", 284, 3), new a54("ResolutionUnit", 296, 3), new a54("TransferFunction", 301, 3), new a54("Software", 305, 2), new a54("DateTime", 306, 2), new a54("Artist", 315, 2), new a54("WhitePoint", 318, 5), new a54("PrimaryChromaticities", 319, 5), new a54("SubIFDPointer", 330, 4), new a54("JPEGInterchangeFormat", 513, 4), new a54("JPEGInterchangeFormatLength", 514, 4), new a54("YCbCrCoefficients", 529, 5), new a54("YCbCrSubSampling", 530, 3), new a54("YCbCrPositioning", 531, 3), new a54("ReferenceBlackWhite", 532, 5), new a54("Copyright", 33432, 2), new a54("ExifIFDPointer", 34665, 4), new a54("GPSInfoIFDPointer", 34853, 4), new a54("SensorTopBorder", 4, 4), new a54("SensorLeftBorder", 5, 4), new a54("SensorBottomBorder", 6, 4), new a54("SensorRightBorder", 7, 4), new a54("ISO", 23, 3), new a54("JpgFromRaw", 46, 7), new a54("Xmp", 700, 1)};
        H = new a54("StripOffsets", 273, 3);
        I = new a54[][]{a54VarArr2, new a54[]{new a54("ExposureTime", 33434, 5), new a54("FNumber", 33437, 5), new a54("ExposureProgram", 34850, 3), new a54("SpectralSensitivity", 34852, 2), new a54("PhotographicSensitivity", 34855, 3), new a54("OECF", 34856, 7), new a54("SensitivityType", 34864, 3), new a54("StandardOutputSensitivity", 34865, 4), new a54("RecommendedExposureIndex", 34866, 4), new a54("ISOSpeed", 34867, 4), new a54("ISOSpeedLatitudeyyy", 34868, 4), new a54("ISOSpeedLatitudezzz", 34869, 4), new a54("ExifVersion", 36864, 2), new a54("DateTimeOriginal", 36867, 2), new a54("DateTimeDigitized", 36868, 2), new a54("OffsetTime", 36880, 2), new a54("OffsetTimeOriginal", 36881, 2), new a54("OffsetTimeDigitized", 36882, 2), new a54("ComponentsConfiguration", 37121, 7), new a54("CompressedBitsPerPixel", 37122, 5), new a54("ShutterSpeedValue", 37377, 10), new a54("ApertureValue", 37378, 5), new a54("BrightnessValue", 37379, 10), new a54("ExposureBiasValue", 37380, 10), new a54("MaxApertureValue", 37381, 5), new a54("SubjectDistance", 37382, 5), new a54("MeteringMode", 37383, 3), new a54("LightSource", 37384, 3), new a54("Flash", 37385, 3), new a54("FocalLength", 37386, 5), new a54("SubjectArea", 37396, 3), new a54("MakerNote", 37500, 7), new a54("UserComment", 37510, 7), new a54("SubSecTime", 37520, 2), new a54("SubSecTimeOriginal", 37521, 2), new a54("SubSecTimeDigitized", 37522, 2), new a54("FlashpixVersion", 40960, 7), new a54("ColorSpace", 40961, 3), new a54(40962, 3, 4, "PixelXDimension"), new a54(40963, 3, 4, "PixelYDimension"), new a54("RelatedSoundFile", 40964, 2), new a54("InteroperabilityIFDPointer", 40965, 4), new a54("FlashEnergy", 41483, 5), new a54("SpatialFrequencyResponse", 41484, 7), new a54("FocalPlaneXResolution", 41486, 5), new a54("FocalPlaneYResolution", 41487, 5), new a54("FocalPlaneResolutionUnit", 41488, 3), new a54("SubjectLocation", 41492, 3), new a54("ExposureIndex", 41493, 5), new a54("SensingMethod", 41495, 3), new a54("FileSource", 41728, 7), new a54("SceneType", 41729, 7), new a54("CFAPattern", 41730, 7), new a54("CustomRendered", 41985, 3), new a54("ExposureMode", 41986, 3), new a54("WhiteBalance", 41987, 3), new a54("DigitalZoomRatio", 41988, 5), new a54("FocalLengthIn35mmFilm", 41989, 3), new a54("SceneCaptureType", 41990, 3), new a54("GainControl", 41991, 3), new a54("Contrast", 41992, 3), new a54("Saturation", 41993, 3), new a54("Sharpness", 41994, 3), new a54("DeviceSettingDescription", 41995, 7), new a54("SubjectDistanceRange", 41996, 3), new a54("ImageUniqueID", 42016, 2), new a54("CameraOwnerName", 42032, 2), new a54("BodySerialNumber", 42033, 2), new a54("LensSpecification", 42034, 5), new a54("LensMake", 42035, 2), new a54("LensModel", 42036, 2), new a54("Gamma", 42240, 5), new a54("DNGVersion", 50706, 1), new a54(50720, 3, 4, "DefaultCropSize")}, new a54[]{new a54("GPSVersionID", 0, 1), new a54("GPSLatitudeRef", 1, 2), new a54(2, 5, 10, "GPSLatitude"), new a54("GPSLongitudeRef", 3, 2), new a54(4, 5, 10, "GPSLongitude"), new a54("GPSAltitudeRef", 5, 1), new a54("GPSAltitude", 6, 5), new a54("GPSTimeStamp", 7, 5), new a54("GPSSatellites", 8, 2), new a54("GPSStatus", 9, 2), new a54("GPSMeasureMode", 10, 2), new a54("GPSDOP", 11, 5), new a54("GPSSpeedRef", 12, 2), new a54("GPSSpeed", 13, 5), new a54("GPSTrackRef", 14, 2), new a54("GPSTrack", 15, 5), new a54("GPSImgDirectionRef", 16, 2), new a54("GPSImgDirection", 17, 5), new a54("GPSMapDatum", 18, 2), new a54("GPSDestLatitudeRef", 19, 2), new a54("GPSDestLatitude", 20, 5), new a54("GPSDestLongitudeRef", 21, 2), new a54("GPSDestLongitude", 22, 5), new a54("GPSDestBearingRef", 23, 2), new a54("GPSDestBearing", 24, 5), new a54("GPSDestDistanceRef", 25, 2), new a54("GPSDestDistance", 26, 5), new a54("GPSProcessingMethod", 27, 7), new a54("GPSAreaInformation", 28, 7), new a54("GPSDateStamp", 29, 2), new a54("GPSDifferential", 30, 3), new a54("GPSHPositioningError", 31, 5)}, new a54[]{new a54("InteroperabilityIndex", 1, 2)}, new a54[]{new a54("NewSubfileType", 254, 4), new a54("SubfileType", 255, 4), new a54(256, 3, 4, "ThumbnailImageWidth"), new a54(257, 3, 4, "ThumbnailImageLength"), new a54("BitsPerSample", 258, 3), new a54("Compression", 259, 3), new a54("PhotometricInterpretation", 262, 3), new a54("ImageDescription", 270, 2), new a54("Make", 271, 2), new a54("Model", 272, 2), new a54(273, 3, 4, "StripOffsets"), new a54("ThumbnailOrientation", 274, 3), new a54("SamplesPerPixel", 277, 3), new a54(278, 3, 4, "RowsPerStrip"), new a54(279, 3, 4, "StripByteCounts"), new a54("XResolution", 282, 5), new a54("YResolution", 283, 5), new a54("PlanarConfiguration", 284, 3), new a54("ResolutionUnit", 296, 3), new a54("TransferFunction", 301, 3), new a54("Software", 305, 2), new a54("DateTime", 306, 2), new a54("Artist", 315, 2), new a54("WhitePoint", 318, 5), new a54("PrimaryChromaticities", 319, 5), new a54("SubIFDPointer", 330, 4), new a54("JPEGInterchangeFormat", 513, 4), new a54("JPEGInterchangeFormatLength", 514, 4), new a54("YCbCrCoefficients", 529, 5), new a54("YCbCrSubSampling", 530, 3), new a54("YCbCrPositioning", 531, 3), new a54("ReferenceBlackWhite", 532, 5), new a54("Copyright", 33432, 2), new a54("ExifIFDPointer", 34665, 4), new a54("GPSInfoIFDPointer", 34853, 4), new a54("DNGVersion", 50706, 1), new a54(50720, 3, 4, "DefaultCropSize")}, a54VarArr2, new a54[]{new a54("ThumbnailImage", 256, 7), new a54("CameraSettingsIFDPointer", 8224, 4), new a54("ImageProcessingIFDPointer", 8256, 4)}, new a54[]{new a54("PreviewImageStart", 257, 4), new a54("PreviewImageLength", 258, 4)}, new a54[]{new a54("AspectFrame", 4371, 3)}, new a54[]{new a54("ColorSpace", 55, 3)}};
        J = new a54[]{new a54("SubIFDPointer", 330, 4), new a54("ExifIFDPointer", 34665, 4), new a54("GPSInfoIFDPointer", 34853, 4), new a54("InteroperabilityIFDPointer", 40965, 4), new a54("CameraSettingsIFDPointer", 8224, 1), new a54("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        N = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        O = forName;
        P = "Exif\u0000\u0000".getBytes(forName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            a54[][] a54VarArr3 = I;
            if (i < a54VarArr3.length) {
                K[i] = new HashMap();
                L[i] = new HashMap();
                for (a54 a54Var : a54VarArr3[i]) {
                    K[i].put(Integer.valueOf(a54Var.a), a54Var);
                    L[i].put(a54Var.b, a54Var);
                }
                i++;
            } else {
                HashMap hashMap = N;
                a54[] a54VarArr4 = J;
                hashMap.put(Integer.valueOf(a54VarArr4[0].a), 5);
                hashMap.put(Integer.valueOf(a54VarArr4[1].a), 1);
                hashMap.put(Integer.valueOf(a54VarArr4[2].a), 2);
                hashMap.put(Integer.valueOf(a54VarArr4[3].a), 3);
                hashMap.put(Integer.valueOf(a54VarArr4[4].a), 7);
                hashMap.put(Integer.valueOf(a54VarArr4[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public d54(InputStream inputStream) {
        a54[][] a54VarArr = I;
        this.e = new HashMap[a54VarArr.length];
        this.f = new HashSet(a54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        e54.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.c = null;
                        this.b = fileInputStream.getFD();
                    } catch (Exception unused) {
                        if (m) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                    }
                }
                this.c = null;
                this.b = null;
            }
            q(inputStream);
            return;
        }
        fvc.f("inputStream cannot be null");
        throw null;
    }

    public static ByteOrder t(y44 y44Var) {
        short readShort = y44Var.readShort();
        boolean z2 = m;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z2) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            w44.e(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void A() {
        y(0, 5);
        y(0, 4);
        y(5, 4);
        HashMap[] hashMapArr = this.e;
        z44 z44Var = (z44) hashMapArr[1].get("PixelXDimension");
        z44 z44Var2 = (z44) hashMapArr[1].get("PixelYDimension");
        if (z44Var != null && z44Var2 != null) {
            hashMapArr[0].put("ImageWidth", z44Var);
            hashMapArr[0].put("ImageLength", z44Var2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!p(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        w(0, "ThumbnailOrientation", "Orientation");
        w(0, "ThumbnailImageLength", "ImageLength");
        w(0, "ThumbnailImageWidth", "ImageWidth");
        w(5, "ThumbnailOrientation", "Orientation");
        w(5, "ThumbnailImageLength", "ImageLength");
        w(5, "ThumbnailImageWidth", "ImageWidth");
        w(4, "Orientation", "ThumbnailOrientation");
        w(4, "ImageLength", "ThumbnailImageLength");
        w(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.e;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat("\u0000").getBytes(O);
            hashMap.put("DateTime", new z44(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", z44.a(0L, this.g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", z44.a(0L, this.g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", z44.a(0L, this.g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", z44.a(0L, this.g));
        }
    }

    public final String b(String str) {
        z44 d = d(str);
        if (d != null) {
            int i = d.a;
            if (!M.contains(str)) {
                return d.f(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                b54[] b54VarArr = (b54[]) d.g(this.g);
                if (b54VarArr != null && b54VarArr.length == 3) {
                    b54 b54Var = b54VarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) b54Var.a) / ((float) b54Var.b)));
                    b54 b54Var2 = b54VarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) b54Var2.a) / ((float) b54Var2.b)));
                    b54 b54Var3 = b54VarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) b54Var3.a) / ((float) b54Var3.b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(b54VarArr));
                return null;
            }
            try {
                return Double.toString(d.d(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        z44 d = d("Orientation");
        if (d != null) {
            try {
                return d.e(this.g);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
        return 1;
    }

    public final z44 d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < I.length; i++) {
            z44 z44Var = (z44) this.e[i].get(str);
            if (z44Var != null) {
                return z44Var;
            }
        }
        return null;
    }

    public final void e(c54 c54Var) {
        String str;
        String str2;
        String str3;
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    f54.a(mediaMetadataRetriever, new x44(c54Var));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.e;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", z44.c(Integer.parseInt(str), this.g));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", z44.c(Integer.parseInt(str2), this.g));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                            } else {
                                i = 3;
                            }
                        } else {
                            i = 6;
                        }
                        hashMapArr[0].put("Orientation", z44.c(i, this.g));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            c54Var.b(parseInt2);
                            byte[] bArr = new byte[6];
                            if (c54Var.read(bArr) == 6) {
                                int i2 = parseInt2 + 6;
                                int i3 = parseInt3 - 6;
                                if (Arrays.equals(bArr, P)) {
                                    byte[] bArr2 = new byte[i3];
                                    if (c54Var.read(bArr2) == i3) {
                                        this.i = i2;
                                        u(0, bArr2);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (m) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        fyb.i("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    public final void f(defpackage.y44 r23, int r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d54.f(y44, int, int):void");
    }

    public final int g(java.io.BufferedInputStream r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d54.g(java.io.BufferedInputStream):int");
    }

    public final void h(c54 c54Var) {
        int i;
        int i2;
        k(c54Var);
        HashMap[] hashMapArr = this.e;
        z44 z44Var = (z44) hashMapArr[1].get("MakerNote");
        if (z44Var != null) {
            c54 c54Var2 = new c54(z44Var.d);
            c54Var2.b = this.g;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            c54Var2.readFully(bArr2);
            c54Var2.b(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            c54Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c54Var2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c54Var2.b(12L);
            }
            v(c54Var2, 6);
            z44 z44Var2 = (z44) hashMapArr[7].get("PreviewImageStart");
            z44 z44Var3 = (z44) hashMapArr[7].get("PreviewImageLength");
            if (z44Var2 != null && z44Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", z44Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", z44Var3);
            }
            z44 z44Var4 = (z44) hashMapArr[8].get("AspectFrame");
            if (z44Var4 != null) {
                int[] iArr = (int[]) z44Var4.g(this.g);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        z44 c = z44.c(i5, this.g);
                        z44 c2 = z44.c(i6, this.g);
                        hashMapArr[0].put("ImageWidth", c);
                        hashMapArr[0].put("ImageLength", c2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void i(y44 y44Var) {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + y44Var);
        }
        y44Var.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = x;
        y44Var.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = y44Var.readInt();
                byte[] bArr2 = new byte[4];
                if (y44Var.read(bArr2) == 4) {
                    int i = length + 8;
                    if (i == 16 && !Arrays.equals(bArr2, z)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, A)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, y)) {
                        byte[] bArr3 = new byte[readInt];
                        if (y44Var.read(bArr3) == readInt) {
                            int readInt2 = y44Var.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.i = i;
                                u(0, bArr3);
                                A();
                                x(new y44(bArr3));
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ufe.a(bArr2));
                    }
                    int i2 = readInt + 4;
                    y44Var.a(i2);
                    length = i + i2;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                k93.f("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void j(y44 y44Var) {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + y44Var);
        }
        y44Var.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        y44Var.read(bArr);
        y44Var.read(bArr2);
        y44Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        y44Var.a(i - y44Var.c);
        y44Var.read(bArr4);
        f(new y44(bArr4), i, 5);
        y44Var.a(i3 - y44Var.c);
        y44Var.b = ByteOrder.BIG_ENDIAN;
        int readInt = y44Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = y44Var.readUnsignedShort();
            int readUnsignedShort2 = y44Var.readUnsignedShort();
            if (readUnsignedShort == H.a) {
                short readShort = y44Var.readShort();
                short readShort2 = y44Var.readShort();
                z44 c = z44.c(readShort, this.g);
                z44 c2 = z44.c(readShort2, this.g);
                HashMap[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            y44Var.a(readUnsignedShort2);
        }
    }

    public final void k(c54 c54Var) {
        r(c54Var);
        v(c54Var, 0);
        z(c54Var, 0);
        z(c54Var, 5);
        z(c54Var, 4);
        A();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.e;
            z44 z44Var = (z44) hashMapArr[1].get("MakerNote");
            if (z44Var != null) {
                c54 c54Var2 = new c54(z44Var.d);
                c54Var2.b = this.g;
                c54Var2.a(6);
                v(c54Var2, 9);
                z44 z44Var2 = (z44) hashMapArr[9].get("ColorSpace");
                if (z44Var2 != null) {
                    hashMapArr[1].put("ColorSpace", z44Var2);
                }
            }
        }
    }

    public final void l(c54 c54Var) {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c54Var);
        }
        k(c54Var);
        HashMap[] hashMapArr = this.e;
        z44 z44Var = (z44) hashMapArr[0].get("JpgFromRaw");
        if (z44Var != null) {
            f(new y44(z44Var.d), (int) z44Var.c, 5);
        }
        z44 z44Var2 = (z44) hashMapArr[0].get("ISO");
        z44 z44Var3 = (z44) hashMapArr[1].get("PhotographicSensitivity");
        if (z44Var2 != null && z44Var3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", z44Var2);
        }
    }

    public final void m(y44 y44Var) {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + y44Var);
        }
        y44Var.b = ByteOrder.LITTLE_ENDIAN;
        y44Var.a(B.length);
        int readInt = y44Var.readInt() + 8;
        byte[] bArr = C;
        y44Var.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (y44Var.read(bArr2) == 4) {
                    int readInt2 = y44Var.readInt();
                    int i = length + 8;
                    if (Arrays.equals(D, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (y44Var.read(bArr3) == readInt2) {
                            this.i = i;
                            u(0, bArr3);
                            x(new y44(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ufe.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        y44Var.a(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                k93.f("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void n(y44 y44Var, HashMap hashMap) {
        z44 z44Var = (z44) hashMap.get("JPEGInterchangeFormat");
        z44 z44Var2 = (z44) hashMap.get("JPEGInterchangeFormatLength");
        if (z44Var != null && z44Var2 != null) {
            int e = z44Var.e(this.g);
            int e2 = z44Var2.e(this.g);
            if (this.d == 7) {
                e += this.j;
            }
            if (e > 0 && e2 > 0 && this.a == null && this.c == null && this.b == null) {
                y44Var.skip(e);
                y44Var.read(new byte[e2]);
            }
            if (m) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
            }
        }
    }

    public final void o(String str) {
        boolean z2;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.c = null;
            this.a = str;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(str);
                    try {
                        try {
                            e54.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                            z2 = true;
                        } catch (Exception unused) {
                            if (m) {
                                Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                            }
                            z2 = false;
                        }
                        if (z2) {
                            this.b = fileInputStream2.getFD();
                        } else {
                            this.b = null;
                        }
                        q(fileInputStream2);
                        try {
                            fileInputStream2.close();
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            fvc.f("filename cannot be null");
        }
    }

    public final boolean p(HashMap hashMap) {
        z44 z44Var = (z44) hashMap.get("ImageLength");
        z44 z44Var2 = (z44) hashMap.get("ImageWidth");
        if (z44Var != null && z44Var2 != null) {
            int e = z44Var.e(this.g);
            int e2 = z44Var2.e(this.g);
            if (e <= 512 && e2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q(InputStream inputStream) {
        boolean z2 = m;
        if (inputStream != null) {
            for (int i = 0; i < I.length; i++) {
                try {
                    try {
                        this.e[i] = new HashMap();
                    } finally {
                        a();
                        if (z2) {
                            s();
                        }
                    }
                } catch (IOException | UnsupportedOperationException e) {
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (z2) {
                        s();
                        return;
                    }
                    return;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            int g = g(bufferedInputStream);
            this.d = g;
            if (g != 4 && g != 9 && g != 13 && g != 14) {
                c54 c54Var = new c54(bufferedInputStream);
                int i2 = this.d;
                if (i2 == 12) {
                    e(c54Var);
                } else if (i2 == 7) {
                    h(c54Var);
                } else if (i2 == 10) {
                    l(c54Var);
                } else {
                    k(c54Var);
                }
                c54Var.b(this.i);
                x(c54Var);
            } else {
                y44 y44Var = new y44(bufferedInputStream);
                int i3 = this.d;
                if (i3 == 4) {
                    f(y44Var, 0, 0);
                } else if (i3 == 13) {
                    i(y44Var);
                } else if (i3 == 9) {
                    j(y44Var);
                } else if (i3 == 14) {
                    m(y44Var);
                }
            }
            if (z2) {
                return;
            }
            return;
        }
        fvc.f("inputstream shouldn't be null");
    }

    public final void r(c54 c54Var) {
        ByteOrder t2 = t(c54Var);
        this.g = t2;
        c54Var.b = t2;
        int readUnsignedShort = c54Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            w44.e(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = c54Var.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                c54Var.a(i2);
                return;
            }
            return;
        }
        k93.f(de9.k(readInt, "Invalid first Ifd offset: "));
    }

    public final void s() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.e;
            if (i < hashMapArr.length) {
                StringBuilder m2 = de9.m(i, "The size of tag group[", "]: ");
                m2.append(hashMapArr[i].size());
                Log.d("ExifInterface", m2.toString());
                for (Map.Entry entry : hashMapArr[i].entrySet()) {
                    z44 z44Var = (z44) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + z44Var.toString() + ", tagValue: '" + z44Var.f(this.g) + "'");
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void u(int i, byte[] bArr) {
        c54 c54Var = new c54(bArr);
        r(c54Var);
        v(c54Var, i);
    }

    public final void v(defpackage.c54 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d54.v(c54, int):void");
    }

    public final void w(int i, String str, String str2) {
        HashMap[] hashMapArr = this.e;
        if (!hashMapArr[i].isEmpty() && hashMapArr[i].get(str) != null) {
            HashMap hashMap = hashMapArr[i];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i].remove(str);
        }
    }

    public final void x(y44 y44Var) {
        z44 z44Var;
        int e;
        HashMap hashMap = this.e[4];
        z44 z44Var2 = (z44) hashMap.get("Compression");
        if (z44Var2 != null) {
            int e2 = z44Var2.e(this.g);
            if (e2 != 1) {
                if (e2 != 6) {
                    if (e2 != 7) {
                        return;
                    }
                } else {
                    n(y44Var, hashMap);
                    return;
                }
            }
            z44 z44Var3 = (z44) hashMap.get("BitsPerSample");
            if (z44Var3 != null) {
                int[] iArr = (int[]) z44Var3.g(this.g);
                int[] iArr2 = p;
                if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (z44Var = (z44) hashMap.get("PhotometricInterpretation")) != null && (((e = z44Var.e(this.g)) == 1 && Arrays.equals(iArr, q)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                    z44 z44Var4 = (z44) hashMap.get("StripOffsets");
                    z44 z44Var5 = (z44) hashMap.get("StripByteCounts");
                    if (z44Var4 != null && z44Var5 != null) {
                        long[] b = ufe.b(z44Var4.g(this.g));
                        long[] b2 = ufe.b(z44Var5.g(this.g));
                        if (b != null && b.length != 0) {
                            if (b2 != null && b2.length != 0) {
                                if (b.length != b2.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j = 0;
                                for (long j2 : b2) {
                                    j += j2;
                                }
                                byte[] bArr = new byte[(int) j];
                                this.h = true;
                                int i = 0;
                                int i2 = 0;
                                for (int i3 = 0; i3 < b.length; i3++) {
                                    int i4 = (int) b[i3];
                                    int i5 = (int) b2[i3];
                                    if (i3 < b.length - 1 && i4 + i5 != b[i3 + 1]) {
                                        this.h = false;
                                    }
                                    int i6 = i4 - i;
                                    if (i6 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    long j3 = i6;
                                    if (y44Var.skip(j3) != j3) {
                                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                                        return;
                                    }
                                    int i7 = i + i6;
                                    byte[] bArr2 = new byte[i5];
                                    if (y44Var.read(bArr2) != i5) {
                                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                                        return;
                                    }
                                    i = i7 + i5;
                                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                                    i2 += i5;
                                }
                                if (this.h) {
                                    long j4 = b[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (m) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        n(y44Var, hashMap);
    }

    public final void y(int i, int i2) {
        HashMap[] hashMapArr = this.e;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = m;
        if (!isEmpty && !hashMapArr[i2].isEmpty()) {
            z44 z44Var = (z44) hashMapArr[i].get("ImageLength");
            z44 z44Var2 = (z44) hashMapArr[i].get("ImageWidth");
            z44 z44Var3 = (z44) hashMapArr[i2].get("ImageLength");
            z44 z44Var4 = (z44) hashMapArr[i2].get("ImageWidth");
            if (z44Var != null && z44Var2 != null) {
                if (z44Var3 != null && z44Var4 != null) {
                    int e = z44Var.e(this.g);
                    int e2 = z44Var2.e(this.g);
                    int e3 = z44Var3.e(this.g);
                    int e4 = z44Var4.e(this.g);
                    if (e < e3 && e2 < e4) {
                        HashMap hashMap = hashMapArr[i];
                        hashMapArr[i] = hashMapArr[i2];
                        hashMapArr[i2] = hashMap;
                    }
                } else if (z2) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z2) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void z(c54 c54Var, int i) {
        z44 c;
        z44 c2;
        HashMap[] hashMapArr = this.e;
        z44 z44Var = (z44) hashMapArr[i].get("DefaultCropSize");
        z44 z44Var2 = (z44) hashMapArr[i].get("SensorTopBorder");
        z44 z44Var3 = (z44) hashMapArr[i].get("SensorLeftBorder");
        z44 z44Var4 = (z44) hashMapArr[i].get("SensorBottomBorder");
        z44 z44Var5 = (z44) hashMapArr[i].get("SensorRightBorder");
        if (z44Var != null) {
            int i2 = z44Var.a;
            ByteOrder byteOrder = this.g;
            if (i2 == 5) {
                b54[] b54VarArr = (b54[]) z44Var.g(byteOrder);
                if (b54VarArr != null && b54VarArr.length == 2) {
                    c = z44.b(b54VarArr[0], this.g);
                    c2 = z44.b(b54VarArr[1], this.g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(b54VarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) z44Var.g(byteOrder);
                if (iArr != null && iArr.length == 2) {
                    c = z44.c(iArr[0], this.g);
                    c2 = z44.c(iArr[1], this.g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
        } else if (z44Var2 != null && z44Var3 != null && z44Var4 != null && z44Var5 != null) {
            int e = z44Var2.e(this.g);
            int e2 = z44Var4.e(this.g);
            int e3 = z44Var5.e(this.g);
            int e4 = z44Var3.e(this.g);
            if (e2 > e && e3 > e4) {
                z44 c3 = z44.c(e2 - e, this.g);
                z44 c4 = z44.c(e3 - e4, this.g);
                hashMapArr[i].put("ImageLength", c3);
                hashMapArr[i].put("ImageWidth", c4);
            }
        } else {
            z44 z44Var6 = (z44) hashMapArr[i].get("ImageLength");
            z44 z44Var7 = (z44) hashMapArr[i].get("ImageWidth");
            if (z44Var6 == null || z44Var7 == null) {
                z44 z44Var8 = (z44) hashMapArr[i].get("JPEGInterchangeFormat");
                z44 z44Var9 = (z44) hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (z44Var8 != null && z44Var9 != null) {
                    int e5 = z44Var8.e(this.g);
                    int e6 = z44Var8.e(this.g);
                    c54Var.b(e5);
                    byte[] bArr = new byte[e6];
                    c54Var.read(bArr);
                    f(new y44(bArr), e5, i);
                }
            }
        }
    }

    public d54(String str) {
        a54[][] a54VarArr = I;
        this.e = new HashMap[a54VarArr.length];
        this.f = new HashSet(a54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            o(str);
        } else {
            fvc.f("filename cannot be null");
            throw null;
        }
    }

    public d54(File file) {
        a54[][] a54VarArr = I;
        this.e = new HashMap[a54VarArr.length];
        this.f = new HashSet(a54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            o(file.getAbsolutePath());
        } else {
            fvc.f("file cannot be null");
            throw null;
        }
    }
}
