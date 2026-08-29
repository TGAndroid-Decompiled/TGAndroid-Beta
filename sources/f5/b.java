package f5;

import android.graphics.Color;
import android.text.TextUtils;
import i7.n6;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class b {
    public static final Pattern f6569a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern f6570b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern f6571c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        u3.c.i(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        hashMap.put("aqua", -16711681);
        hashMap.put("aquamarine", -8388652);
        u3.c.i(-983041, hashMap, "azure", -657956, "beige");
        u3.c.i(-6972, hashMap, "bisque", -16777216, "black");
        u3.c.i(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        u3.c.i(-7722014, hashMap, "blueviolet", -5952982, "brown");
        u3.c.i(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        u3.c.i(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        u3.c.i(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        u3.c.i(-1828, hashMap, "cornsilk", -2354116, "crimson");
        hashMap.put("cyan", -16711681);
        hashMap.put("darkblue", -16777077);
        u3.c.i(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        hashMap.put("darkgray", -5658199);
        hashMap.put("darkgreen", -16751616);
        hashMap.put("darkgrey", -5658199);
        hashMap.put("darkkhaki", -4343957);
        u3.c.i(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        u3.c.i(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        u3.c.i(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        u3.c.i(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        hashMap.put("darkturquoise", -16724271);
        hashMap.put("darkviolet", -7077677);
        u3.c.i(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        hashMap.put("dodgerblue", -14774017);
        hashMap.put("firebrick", -5103070);
        u3.c.i(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        hashMap.put("fuchsia", -65281);
        hashMap.put("gainsboro", -2302756);
        u3.c.i(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        u3.c.i(-16744448, hashMap, "green", -5374161, "greenyellow");
        hashMap.put("grey", -8355712);
        hashMap.put("honeydew", -983056);
        u3.c.i(-38476, hashMap, "hotpink", -3318692, "indianred");
        u3.c.i(-11861886, hashMap, "indigo", -16, "ivory");
        u3.c.i(-989556, hashMap, "khaki", -1644806, "lavender");
        u3.c.i(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        u3.c.i(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        u3.c.i(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        u3.c.i(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        u3.c.i(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        hashMap.put("lightsteelblue", -5192482);
        hashMap.put("lightyellow", -32);
        u3.c.i(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        u3.c.i(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        u3.c.i(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        u3.c.i(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        u3.c.i(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        u3.c.i(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        u3.c.i(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        u3.c.i(-6943, hashMap, "mistyrose", -6987, "moccasin");
        u3.c.i(-8531, hashMap, "navajowhite", -16777088, "navy");
        u3.c.i(-133658, hashMap, "oldlace", -8355840, "olive");
        u3.c.i(-9728477, hashMap, "olivedrab", -23296, "orange");
        u3.c.i(-47872, hashMap, "orangered", -2461482, "orchid");
        u3.c.i(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        u3.c.i(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        u3.c.i(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        u3.c.i(-3308225, hashMap, "peru", -16181, "pink");
        u3.c.i(-2252579, hashMap, "plum", -5185306, "powderblue");
        u3.c.i(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        u3.c.i(-65536, hashMap, "red", -4419697, "rosybrown");
        u3.c.i(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        u3.c.i(-360334, hashMap, "salmon", -744352, "sandybrown");
        u3.c.i(-13726889, hashMap, "seagreen", -2578, "seashell");
        u3.c.i(-6270419, hashMap, "sienna", -4144960, "silver");
        u3.c.i(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        hashMap.put("snow", -1286);
        hashMap.put("springgreen", -16711809);
        u3.c.i(-12156236, hashMap, "steelblue", -2968436, "tan");
        u3.c.i(-16744320, hashMap, "teal", -2572328, "thistle");
        u3.c.i(-40121, hashMap, "tomato", 0, "transparent");
        u3.c.i(-12525360, hashMap, "turquoise", -1146130, "violet");
        u3.c.i(-663885, hashMap, "wheat", -1, "white");
        u3.c.i(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z10) {
        Pattern pattern;
        int parseInt;
        a.f(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            if (z10) {
                pattern = f6571c;
            } else {
                pattern = f6570b;
            }
            Matcher matcher = pattern.matcher(replace);
            if (matcher.matches()) {
                if (z10) {
                    String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f6569a.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) d.get(n6.b(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
