package o5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j7.l1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import l3.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class l extends a6.a {
    public static final g0 f19288e;
    public final List f19289a;
    public final Bundle f19290b;
    public int f19291c;
    public static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<l> CREATOR = new v(11);

    static {
        g0 g0Var = new g0(14);
        g0Var.E(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        g0Var.E(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        g0Var.E(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        g0Var.E(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        g0Var.E(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        g0Var.E(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        g0Var.E(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        g0Var.E(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        g0Var.E(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        g0Var.E(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        g0Var.E(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        g0Var.E(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        g0Var.E(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        g0Var.E(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        g0Var.E(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        g0Var.E(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        g0Var.E(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        g0Var.E(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        g0Var.E(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        g0Var.E(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        g0Var.E(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        g0Var.E(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        g0Var.E(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        g0Var.E(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        g0Var.E(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        g0Var.E(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        g0Var.E(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        g0Var.E(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        f19288e = g0Var;
    }

    public l(ArrayList arrayList, Bundle bundle, int i10) {
        this.f19289a = arrayList;
        this.f19290b = bundle;
        this.f19291c = i10;
    }

    public static void c(int i10, String str) {
        int i11;
        if (!TextUtils.isEmpty(str)) {
            Integer num = (Integer) ((HashMap) f19288e.d).get(str);
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            if (i11 != i10 && i11 != 0) {
                throw new IllegalArgumentException(l1.n("Value for ", str, " must be a ", d[i10]));
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    public static boolean f(Bundle bundle, Bundle bundle2) {
        if (bundle.size() == bundle2.size()) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle) || f((Bundle) obj, (Bundle) obj2)) {
                    if (obj == null) {
                        if (obj2 != null || !bundle2.containsKey(str)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void b(String str, String str2) {
        c(1, str);
        this.f19290b.putString(str, str2);
    }

    public final JSONObject d() {
        Bundle bundle;
        int i10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.f19291c);
        } catch (JSONException unused) {
        }
        JSONArray b10 = t5.a.b(this.f19289a);
        if (b10.length() != 0) {
            try {
                jSONObject.put("images", b10);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i11 = this.f19291c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                bundle = this.f19290b;
                if (i12 >= size) {
                    break;
                }
                Object obj = arrayList.get(i12);
                i12++;
                String str = (String) obj;
                if (str != null && bundle.containsKey(str)) {
                    g0 g0Var = f19288e;
                    String str2 = (String) ((HashMap) g0Var.f14096b).get(str);
                    if (str2 != null) {
                        Integer num = (Integer) ((HashMap) g0Var.d).get(str);
                        if (num != null) {
                            i10 = num.intValue();
                        } else {
                            i10 = 0;
                        }
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        if (i10 == 5) {
                                            long j10 = bundle.getLong(str);
                                            Pattern pattern = s5.a.f47578a;
                                            jSONObject.put(str2, j10 / 1000.0d);
                                        }
                                    }
                                } else {
                                    jSONObject.put(str2, bundle.getDouble(str));
                                }
                            } else {
                                jSONObject.put(str2, bundle.getInt(str));
                            }
                        }
                        jSONObject.put(str2, bundle.getString(str));
                    }
                }
            }
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj2 = bundle.get(str3);
                    if (obj2 instanceof String) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Double) {
                        jSONObject.put(str3, obj2);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void e(JSONObject jSONObject) {
        HashSet hashSet;
        int i10;
        Bundle bundle = this.f19290b;
        bundle.clear();
        List list = this.f19289a;
        list.clear();
        this.f19291c = 0;
        try {
            this.f19291c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            t5.a.c(list, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = this.f19291c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet2 = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    g0 g0Var = f19288e;
                    String str = (String) ((HashMap) g0Var.f14097c).get(next);
                    if (str != null) {
                        if (hashSet2.contains(str)) {
                            try {
                                Object obj = jSONObject.get(next);
                                if (obj != null) {
                                    Integer num = (Integer) ((HashMap) g0Var.d).get(str);
                                    if (num != null) {
                                        i10 = num.intValue();
                                    } else {
                                        i10 = 0;
                                    }
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            if (i10 != 3) {
                                                if (i10 != 4) {
                                                    if (i10 == 5) {
                                                        long optLong = jSONObject.optLong(next);
                                                        Pattern pattern = s5.a.f47578a;
                                                        hashSet = hashSet2;
                                                        try {
                                                            bundle.putLong(str, optLong * 1000);
                                                        } catch (JSONException unused2) {
                                                        }
                                                    }
                                                } else {
                                                    hashSet = hashSet2;
                                                    if (obj instanceof String) {
                                                        String str2 = (String) obj;
                                                        if (t5.a.a(str2) != null) {
                                                            bundle.putString(str, str2);
                                                        }
                                                    }
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                double optDouble = jSONObject.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    bundle.putDouble(str, optDouble);
                                                }
                                            }
                                        } else {
                                            hashSet = hashSet2;
                                            if (obj instanceof Integer) {
                                                bundle.putInt(str, ((Integer) obj).intValue());
                                            }
                                        }
                                    } else {
                                        hashSet = hashSet2;
                                        if (obj instanceof String) {
                                            bundle.putString(str, (String) obj);
                                        }
                                    }
                                }
                            } catch (JSONException unused3) {
                                hashSet = hashSet2;
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            bundle.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            bundle.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                    hashSet2 = hashSet;
                }
            }
        } catch (JSONException unused4) {
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (f(this.f19290b, lVar.f19290b) && this.f19289a.equals(lVar.f19289a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = 17;
        Bundle bundle = this.f19290b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                int i12 = i11 * 31;
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                i11 = i12 + i10;
            }
        }
        return this.f19289a.hashCode() + (i11 * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.p(parcel, 2, this.f19289a);
        com.google.android.gms.internal.cast.o.b(parcel, 3, this.f19290b);
        int i11 = this.f19291c;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }

    public l(int i10) {
        this(new ArrayList(), new Bundle(), i10);
    }
}
