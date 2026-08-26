package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.xml.parsers.SAXParserFactory;
import org.telegram.messenger.wallpaper.WallpaperGiftPatternPosition;
import org.telegram.ui.ActionBar.Theme;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SvgHelper {
    private static final Pattern SPLIT_BOUNDARY;
    private static final double[] pow10 = new double[128];

    public static class Circle {
        float rad;
        float x1;
        float y1;

        public Circle(float f, float f2, float f3) {
            this.x1 = f;
            this.y1 = f2;
            this.rad = f3;
        }
    }

    public static class Line {
        float x1;
        float x2;
        float y1;
        float y2;

        public Line(float f, float f2, float f3, float f4) {
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
        }
    }

    public static class NumberParse {
        private int nextCmd;
        private ArrayList<Float> numbers;

        public NumberParse(ArrayList<Float> arrayList, int i) {
            this.numbers = arrayList;
            this.nextCmd = i;
        }

        public int getNextCmd() {
            return this.nextCmd;
        }

        public float getNumber(int i) {
            return this.numbers.get(i).floatValue();
        }
    }

    public static class Oval {
        RectF rect;

        public Oval(RectF rectF) {
            this.rect = rectF;
        }
    }

    public static class ParserHelper {
        private char current;
        private int n;
        public int pos;
        private CharSequence s;

        public ParserHelper(CharSequence charSequence, int i) {
            this.s = charSequence;
            this.pos = i;
            this.n = charSequence.length();
            this.current = charSequence.charAt(i);
        }

        private char read() {
            int i = this.pos;
            int i2 = this.n;
            if (i < i2) {
                this.pos = i + 1;
            }
            int i3 = this.pos;
            if (i3 == i2) {
                return (char) 0;
            }
            return this.s.charAt(i3);
        }

        private void reportUnexpectedCharacterError(char c) {
            throw new RuntimeException("Unexpected char '" + c + "'.");
        }

        public void advance() {
            this.current = read();
        }

        public float buildFloat(int i, int i2) {
            if (i2 < -125 || i == 0) {
                return 0.0f;
            }
            if (i2 >= 128) {
                return i > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
            }
            if (i2 == 0) {
                return i;
            }
            if (i >= 67108864) {
                i++;
            }
            return (float) (i2 > 0 ? ((double) i) * SvgHelper.pow10[i2] : ((double) i) / SvgHelper.pow10[-i2]);
        }

        public float nextFloat() {
            skipWhitespace();
            float f = parseFloat();
            skipNumberSeparator();
            return f;
        }

        public float parseFloat() {
            boolean z;
            int i;
            int i2;
            int i3;
            boolean z2;
            char c;
            char c2;
            char c3;
            char c4;
            int i4;
            char c5;
            char c6;
            char c7;
            char c8;
            char c9;
            char c10;
            char c11 = this.current;
            int i5 = 0;
            boolean z3 = true;
            if (c11 != '+') {
                if (c11 != '-') {
                    z = true;
                } else {
                    z = false;
                }
                switch (this.current) {
                    case '.':
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        z2 = false;
                        if (this.current == '.') {
                            c7 = read();
                            this.current = c7;
                            switch (c7) {
                                case '0':
                                    if (i == 0) {
                                        while (true) {
                                            c9 = read();
                                            this.current = c9;
                                            i2--;
                                            switch (c9) {
                                                case '0':
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    if (!z2) {
                                                        return 0.0f;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    while (true) {
                                        if (i < 9) {
                                            i++;
                                            i2--;
                                            i3 = (this.current - '0') + (i3 * 10);
                                        }
                                        c8 = read();
                                        this.current = c8;
                                        switch (c8) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    if (!z2) {
                                        reportUnexpectedCharacterError(c7);
                                        return 0.0f;
                                    }
                                    break;
                            }
                        }
                        c2 = this.current;
                        if (c2 != 'E' || c2 == 'e') {
                            c3 = read();
                            this.current = c3;
                            if (c3 == '+') {
                                c4 = read();
                                this.current = c4;
                                switch (c4) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c4);
                                        return 0.0f;
                                }
                            } else if (c3 != '-') {
                                switch (c3) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c3);
                                        return 0.0f;
                                }
                            } else {
                                z3 = false;
                                c4 = read();
                                this.current = c4;
                                switch (c4) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c4);
                                        return 0.0f;
                                }
                            }
                            switch (this.current) {
                                case '0':
                                    while (true) {
                                        c6 = read();
                                        this.current = c6;
                                        switch (c6) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i4 = 0;
                                                while (true) {
                                                    if (i5 < 3) {
                                                        i5++;
                                                        i4 = (this.current - '0') + (i4 * 10);
                                                    }
                                                    c5 = read();
                                                    this.current = c5;
                                                    switch (c5) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            i5 = i4;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i4 = 0;
                                    while (true) {
                                        if (i5 < 3) {
                                            i5++;
                                            i4 = (this.current - '0') + (i4 * 10);
                                        }
                                        c5 = read();
                                        this.current = c5;
                                        switch (c5) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                i5 = i4;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        if (!z3) {
                            i5 = -i5;
                        }
                        int i6 = i5 + i2;
                        if (!z) {
                            i3 = -i3;
                        }
                        return buildFloat(i3, i6);
                    case '/':
                    default:
                        return Float.NaN;
                    case '0':
                        while (true) {
                            c10 = read();
                            this.current = c10;
                            if (c10 != '.' || c10 == 'E' || c10 == 'e') {
                                i = 0;
                                i2 = 0;
                                i3 = 0;
                                z2 = true;
                                if (this.current == '.') {
                                    c7 = read();
                                    this.current = c7;
                                    switch (c7) {
                                        case '0':
                                            if (i == 0) {
                                                while (true) {
                                                    c9 = read();
                                                    this.current = c9;
                                                    i2--;
                                                    switch (c9) {
                                                        case '0':
                                                            break;
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            if (!z2) {
                                                                return 0.0f;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            while (true) {
                                                if (i < 9) {
                                                    i++;
                                                    i2--;
                                                    i3 = (this.current - '0') + (i3 * 10);
                                                }
                                                c8 = read();
                                                this.current = c8;
                                                switch (c8) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (!z2) {
                                                reportUnexpectedCharacterError(c7);
                                                return 0.0f;
                                            }
                                            break;
                                    }
                                }
                                c2 = this.current;
                                if (c2 != 'E') {
                                    c3 = read();
                                    this.current = c3;
                                    if (c3 == '+') {
                                        c4 = read();
                                        this.current = c4;
                                        switch (c4) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c4);
                                                return 0.0f;
                                        }
                                    } else if (c3 != '-') {
                                        switch (c3) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c3);
                                                return 0.0f;
                                        }
                                    } else {
                                        z3 = false;
                                        c4 = read();
                                        this.current = c4;
                                        switch (c4) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c4);
                                                return 0.0f;
                                        }
                                    }
                                    switch (this.current) {
                                        case '0':
                                            while (true) {
                                                c6 = read();
                                                this.current = c6;
                                                switch (c6) {
                                                    case '0':
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        i4 = 0;
                                                        while (true) {
                                                            if (i5 < 3) {
                                                                i5++;
                                                                i4 = (this.current - '0') + (i4 * 10);
                                                            }
                                                            c5 = read();
                                                            this.current = c5;
                                                            switch (c5) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    break;
                                                                default:
                                                                    i5 = i4;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i4 = 0;
                                            while (true) {
                                                if (i5 < 3) {
                                                    i5++;
                                                    i4 = (this.current - '0') + (i4 * 10);
                                                }
                                                c5 = read();
                                                this.current = c5;
                                                switch (c5) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i5 = i4;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    c3 = read();
                                    this.current = c3;
                                    if (c3 == '+') {
                                        c4 = read();
                                        this.current = c4;
                                        switch (c4) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c4);
                                                return 0.0f;
                                        }
                                    } else if (c3 != '-') {
                                        switch (c3) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c3);
                                                return 0.0f;
                                        }
                                    } else {
                                        z3 = false;
                                        c4 = read();
                                        this.current = c4;
                                        switch (c4) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c4);
                                                return 0.0f;
                                        }
                                    }
                                    switch (this.current) {
                                        case '0':
                                            while (true) {
                                                c6 = read();
                                                this.current = c6;
                                                switch (c6) {
                                                    case '0':
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        i4 = 0;
                                                        while (true) {
                                                            if (i5 < 3) {
                                                                i5++;
                                                                i4 = (this.current - '0') + (i4 * 10);
                                                            }
                                                            c5 = read();
                                                            this.current = c5;
                                                            switch (c5) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    break;
                                                                default:
                                                                    i5 = i4;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i4 = 0;
                                            while (true) {
                                                if (i5 < 3) {
                                                    i5++;
                                                    i4 = (this.current - '0') + (i4 * 10);
                                                }
                                                c5 = read();
                                                this.current = c5;
                                                switch (c5) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i5 = i4;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                if (!z3) {
                                    i5 = -i5;
                                }
                                int i7 = i5 + i2;
                                if (!z) {
                                    i3 = -i3;
                                }
                                return buildFloat(i3, i7);
                            }
                            switch (c10) {
                                case '0':
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    return 0.0f;
                            }
                            i = 0;
                            i2 = 0;
                            i3 = 0;
                            while (true) {
                                if (i < 9) {
                                    i++;
                                    i3 = (i3 * 10) + (this.current - '0');
                                } else {
                                    i2++;
                                }
                                c = read();
                                this.current = c;
                                switch (c) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                }
                                z2 = true;
                                if (this.current == '.') {
                                    c7 = read();
                                    this.current = c7;
                                    switch (c7) {
                                        case '0':
                                            if (i == 0) {
                                                while (true) {
                                                    c9 = read();
                                                    this.current = c9;
                                                    i2--;
                                                    switch (c9) {
                                                        case '0':
                                                            break;
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            if (!z2) {
                                                                return 0.0f;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            while (true) {
                                                if (i < 9) {
                                                    i++;
                                                    i2--;
                                                    i3 = (this.current - '0') + (i3 * 10);
                                                }
                                                c8 = read();
                                                this.current = c8;
                                                switch (c8) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (!z2) {
                                                reportUnexpectedCharacterError(c7);
                                                return 0.0f;
                                            }
                                            break;
                                    }
                                }
                                c2 = this.current;
                                if (c2 != 'E') {
                                    c3 = read();
                                    this.current = c3;
                                    if (c3 == '+') {
                                        c4 = read();
                                        this.current = c4;
                                        switch (c4) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c4);
                                                return 0.0f;
                                        }
                                    } else if (c3 != '-') {
                                        switch (c3) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c3);
                                                return 0.0f;
                                        }
                                    } else {
                                        z3 = false;
                                        c4 = read();
                                        this.current = c4;
                                        switch (c4) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c4);
                                                return 0.0f;
                                        }
                                    }
                                    switch (this.current) {
                                        case '0':
                                            while (true) {
                                                c6 = read();
                                                this.current = c6;
                                                switch (c6) {
                                                    case '0':
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        i4 = 0;
                                                        while (true) {
                                                            if (i5 < 3) {
                                                                i5++;
                                                                i4 = (this.current - '0') + (i4 * 10);
                                                            }
                                                            c5 = read();
                                                            this.current = c5;
                                                            switch (c5) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    break;
                                                                default:
                                                                    i5 = i4;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i4 = 0;
                                            while (true) {
                                                if (i5 < 3) {
                                                    i5++;
                                                    i4 = (this.current - '0') + (i4 * 10);
                                                }
                                                c5 = read();
                                                this.current = c5;
                                                switch (c5) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i5 = i4;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    c3 = read();
                                    this.current = c3;
                                    if (c3 == '+') {
                                        c4 = read();
                                        this.current = c4;
                                        switch (c4) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c4);
                                                return 0.0f;
                                        }
                                    } else if (c3 != '-') {
                                        switch (c3) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c3);
                                                return 0.0f;
                                        }
                                    } else {
                                        z3 = false;
                                        c4 = read();
                                        this.current = c4;
                                        switch (c4) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c4);
                                                return 0.0f;
                                        }
                                    }
                                    switch (this.current) {
                                        case '0':
                                            while (true) {
                                                c6 = read();
                                                this.current = c6;
                                                switch (c6) {
                                                    case '0':
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        i4 = 0;
                                                        while (true) {
                                                            if (i5 < 3) {
                                                                i5++;
                                                                i4 = (this.current - '0') + (i4 * 10);
                                                            }
                                                            c5 = read();
                                                            this.current = c5;
                                                            switch (c5) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    break;
                                                                default:
                                                                    i5 = i4;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i4 = 0;
                                            while (true) {
                                                if (i5 < 3) {
                                                    i5++;
                                                    i4 = (this.current - '0') + (i4 * 10);
                                                }
                                                c5 = read();
                                                this.current = c5;
                                                switch (c5) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i5 = i4;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                if (!z3) {
                                    i5 = -i5;
                                }
                                int i8 = i5 + i2;
                                if (!z) {
                                    i3 = -i3;
                                }
                                return buildFloat(i3, i8);
                            }
                        }
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        while (true) {
                            if (i < 9) {
                                i++;
                                i3 = (i3 * 10) + (this.current - '0');
                            } else {
                                i2++;
                            }
                            c = read();
                            this.current = c;
                            switch (c) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                            }
                            z2 = true;
                            if (this.current == '.') {
                                c7 = read();
                                this.current = c7;
                                switch (c7) {
                                    case '0':
                                        if (i == 0) {
                                            while (true) {
                                                c9 = read();
                                                this.current = c9;
                                                i2--;
                                                switch (c9) {
                                                    case '0':
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        if (!z2) {
                                                            return 0.0f;
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        while (true) {
                                            if (i < 9) {
                                                i++;
                                                i2--;
                                                i3 = (this.current - '0') + (i3 * 10);
                                            }
                                            c8 = read();
                                            this.current = c8;
                                            switch (c8) {
                                                case '0':
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        if (!z2) {
                                            reportUnexpectedCharacterError(c7);
                                            return 0.0f;
                                        }
                                        break;
                                }
                            }
                            c2 = this.current;
                            if (c2 != 'E') {
                                c3 = read();
                                this.current = c3;
                                if (c3 == '+') {
                                    c4 = read();
                                    this.current = c4;
                                    switch (c4) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c4);
                                            return 0.0f;
                                    }
                                } else if (c3 != '-') {
                                    switch (c3) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c3);
                                            return 0.0f;
                                    }
                                } else {
                                    z3 = false;
                                    c4 = read();
                                    this.current = c4;
                                    switch (c4) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c4);
                                            return 0.0f;
                                    }
                                }
                                switch (this.current) {
                                    case '0':
                                        while (true) {
                                            c6 = read();
                                            this.current = c6;
                                            switch (c6) {
                                                case '0':
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    i4 = 0;
                                                    while (true) {
                                                        if (i5 < 3) {
                                                            i5++;
                                                            i4 = (this.current - '0') + (i4 * 10);
                                                        }
                                                        c5 = read();
                                                        this.current = c5;
                                                        switch (c5) {
                                                            case '0':
                                                            case '1':
                                                            case '2':
                                                            case '3':
                                                            case '4':
                                                            case '5':
                                                            case '6':
                                                            case '7':
                                                            case '8':
                                                            case '9':
                                                                break;
                                                            default:
                                                                i5 = i4;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        i4 = 0;
                                        while (true) {
                                            if (i5 < 3) {
                                                i5++;
                                                i4 = (this.current - '0') + (i4 * 10);
                                            }
                                            c5 = read();
                                            this.current = c5;
                                            switch (c5) {
                                                case '0':
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    i5 = i4;
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                c3 = read();
                                this.current = c3;
                                if (c3 == '+') {
                                    c4 = read();
                                    this.current = c4;
                                    switch (c4) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c4);
                                            return 0.0f;
                                    }
                                } else if (c3 != '-') {
                                    switch (c3) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c3);
                                            return 0.0f;
                                    }
                                } else {
                                    z3 = false;
                                    c4 = read();
                                    this.current = c4;
                                    switch (c4) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c4);
                                            return 0.0f;
                                    }
                                }
                                switch (this.current) {
                                    case '0':
                                        while (true) {
                                            c6 = read();
                                            this.current = c6;
                                            switch (c6) {
                                                case '0':
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    i4 = 0;
                                                    while (true) {
                                                        if (i5 < 3) {
                                                            i5++;
                                                            i4 = (this.current - '0') + (i4 * 10);
                                                        }
                                                        c5 = read();
                                                        this.current = c5;
                                                        switch (c5) {
                                                            case '0':
                                                            case '1':
                                                            case '2':
                                                            case '3':
                                                            case '4':
                                                            case '5':
                                                            case '6':
                                                            case '7':
                                                            case '8':
                                                            case '9':
                                                                break;
                                                            default:
                                                                i5 = i4;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        i4 = 0;
                                        while (true) {
                                            if (i5 < 3) {
                                                i5++;
                                                i4 = (this.current - '0') + (i4 * 10);
                                            }
                                            c5 = read();
                                            this.current = c5;
                                            switch (c5) {
                                                case '0':
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    i5 = i4;
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            if (!z3) {
                                i5 = -i5;
                            }
                            int i9 = i5 + i2;
                            if (!z) {
                                i3 = -i3;
                            }
                            return buildFloat(i3, i9);
                        }
                }
            }
            z = true;
            this.current = read();
            switch (this.current) {
                case '.':
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    z2 = false;
                    if (this.current == '.') {
                        c7 = read();
                        this.current = c7;
                        switch (c7) {
                            case '0':
                                if (i == 0) {
                                    while (true) {
                                        c9 = read();
                                        this.current = c9;
                                        i2--;
                                        switch (c9) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                if (!z2) {
                                                    return 0.0f;
                                                }
                                                break;
                                        }
                                    }
                                }
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                while (true) {
                                    if (i < 9) {
                                        i++;
                                        i2--;
                                        i3 = (this.current - '0') + (i3 * 10);
                                    }
                                    c8 = read();
                                    this.current = c8;
                                    switch (c8) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                    }
                                }
                                break;
                            default:
                                if (!z2) {
                                    reportUnexpectedCharacterError(c7);
                                    return 0.0f;
                                }
                                break;
                        }
                    }
                    c2 = this.current;
                    if (c2 != 'E') {
                        c3 = read();
                        this.current = c3;
                        if (c3 == '+') {
                            c4 = read();
                            this.current = c4;
                            switch (c4) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c4);
                                    return 0.0f;
                            }
                        } else if (c3 != '-') {
                            switch (c3) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c3);
                                    return 0.0f;
                            }
                        } else {
                            z3 = false;
                            c4 = read();
                            this.current = c4;
                            switch (c4) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c4);
                                    return 0.0f;
                            }
                        }
                        switch (this.current) {
                            case '0':
                                while (true) {
                                    c6 = read();
                                    this.current = c6;
                                    switch (c6) {
                                        case '0':
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i4 = 0;
                                            while (true) {
                                                if (i5 < 3) {
                                                    i5++;
                                                    i4 = (this.current - '0') + (i4 * 10);
                                                }
                                                c5 = read();
                                                this.current = c5;
                                                switch (c5) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i5 = i4;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                i4 = 0;
                                while (true) {
                                    if (i5 < 3) {
                                        i5++;
                                        i4 = (this.current - '0') + (i4 * 10);
                                    }
                                    c5 = read();
                                    this.current = c5;
                                    switch (c5) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            i5 = i4;
                                            break;
                                    }
                                }
                                break;
                        }
                    } else {
                        c3 = read();
                        this.current = c3;
                        if (c3 == '+') {
                            c4 = read();
                            this.current = c4;
                            switch (c4) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c4);
                                    return 0.0f;
                            }
                        } else if (c3 != '-') {
                            switch (c3) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c3);
                                    return 0.0f;
                            }
                        } else {
                            z3 = false;
                            c4 = read();
                            this.current = c4;
                            switch (c4) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c4);
                                    return 0.0f;
                            }
                        }
                        switch (this.current) {
                            case '0':
                                while (true) {
                                    c6 = read();
                                    this.current = c6;
                                    switch (c6) {
                                        case '0':
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i4 = 0;
                                            while (true) {
                                                if (i5 < 3) {
                                                    i5++;
                                                    i4 = (this.current - '0') + (i4 * 10);
                                                }
                                                c5 = read();
                                                this.current = c5;
                                                switch (c5) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i5 = i4;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                i4 = 0;
                                while (true) {
                                    if (i5 < 3) {
                                        i5++;
                                        i4 = (this.current - '0') + (i4 * 10);
                                    }
                                    c5 = read();
                                    this.current = c5;
                                    switch (c5) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            i5 = i4;
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    if (!z3) {
                        i5 = -i5;
                    }
                    int i10 = i5 + i2;
                    if (!z) {
                        i3 = -i3;
                    }
                    return buildFloat(i3, i10);
                case '/':
                default:
                    return Float.NaN;
                case '0':
                    while (true) {
                        c10 = read();
                        this.current = c10;
                        if (c10 != '.') {
                        }
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        z2 = true;
                        if (this.current == '.') {
                            c7 = read();
                            this.current = c7;
                            switch (c7) {
                                case '0':
                                    if (i == 0) {
                                        while (true) {
                                            c9 = read();
                                            this.current = c9;
                                            i2--;
                                            switch (c9) {
                                                case '0':
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    if (!z2) {
                                                        return 0.0f;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    while (true) {
                                        if (i < 9) {
                                            i++;
                                            i2--;
                                            i3 = (this.current - '0') + (i3 * 10);
                                        }
                                        c8 = read();
                                        this.current = c8;
                                        switch (c8) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    if (!z2) {
                                        reportUnexpectedCharacterError(c7);
                                        return 0.0f;
                                    }
                                    break;
                            }
                        }
                        c2 = this.current;
                        if (c2 != 'E') {
                            c3 = read();
                            this.current = c3;
                            if (c3 == '+') {
                                c4 = read();
                                this.current = c4;
                                switch (c4) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c4);
                                        return 0.0f;
                                }
                            } else if (c3 != '-') {
                                switch (c3) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c3);
                                        return 0.0f;
                                }
                            } else {
                                z3 = false;
                                c4 = read();
                                this.current = c4;
                                switch (c4) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c4);
                                        return 0.0f;
                                }
                            }
                            switch (this.current) {
                                case '0':
                                    while (true) {
                                        c6 = read();
                                        this.current = c6;
                                        switch (c6) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i4 = 0;
                                                while (true) {
                                                    if (i5 < 3) {
                                                        i5++;
                                                        i4 = (this.current - '0') + (i4 * 10);
                                                    }
                                                    c5 = read();
                                                    this.current = c5;
                                                    switch (c5) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            i5 = i4;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i4 = 0;
                                    while (true) {
                                        if (i5 < 3) {
                                            i5++;
                                            i4 = (this.current - '0') + (i4 * 10);
                                        }
                                        c5 = read();
                                        this.current = c5;
                                        switch (c5) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                i5 = i4;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        } else {
                            c3 = read();
                            this.current = c3;
                            if (c3 == '+') {
                                c4 = read();
                                this.current = c4;
                                switch (c4) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c4);
                                        return 0.0f;
                                }
                            } else if (c3 != '-') {
                                switch (c3) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c3);
                                        return 0.0f;
                                }
                            } else {
                                z3 = false;
                                c4 = read();
                                this.current = c4;
                                switch (c4) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c4);
                                        return 0.0f;
                                }
                            }
                            switch (this.current) {
                                case '0':
                                    while (true) {
                                        c6 = read();
                                        this.current = c6;
                                        switch (c6) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i4 = 0;
                                                while (true) {
                                                    if (i5 < 3) {
                                                        i5++;
                                                        i4 = (this.current - '0') + (i4 * 10);
                                                    }
                                                    c5 = read();
                                                    this.current = c5;
                                                    switch (c5) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            i5 = i4;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i4 = 0;
                                    while (true) {
                                        if (i5 < 3) {
                                            i5++;
                                            i4 = (this.current - '0') + (i4 * 10);
                                        }
                                        c5 = read();
                                        this.current = c5;
                                        switch (c5) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                i5 = i4;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        if (!z3) {
                            i5 = -i5;
                        }
                        int i11 = i5 + i2;
                        if (!z) {
                            i3 = -i3;
                        }
                        return buildFloat(i3, i11);
                    }
                    break;
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    while (true) {
                        if (i < 9) {
                            i++;
                            i3 = (i3 * 10) + (this.current - '0');
                        } else {
                            i2++;
                        }
                        c = read();
                        this.current = c;
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                        }
                        z2 = true;
                        if (this.current == '.') {
                            c7 = read();
                            this.current = c7;
                            switch (c7) {
                                case '0':
                                    if (i == 0) {
                                        while (true) {
                                            c9 = read();
                                            this.current = c9;
                                            i2--;
                                            switch (c9) {
                                                case '0':
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    if (!z2) {
                                                        return 0.0f;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    while (true) {
                                        if (i < 9) {
                                            i++;
                                            i2--;
                                            i3 = (this.current - '0') + (i3 * 10);
                                        }
                                        c8 = read();
                                        this.current = c8;
                                        switch (c8) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    if (!z2) {
                                        reportUnexpectedCharacterError(c7);
                                        return 0.0f;
                                    }
                                    break;
                            }
                        }
                        c2 = this.current;
                        if (c2 != 'E') {
                            c3 = read();
                            this.current = c3;
                            if (c3 == '+') {
                                c4 = read();
                                this.current = c4;
                                switch (c4) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c4);
                                        return 0.0f;
                                }
                            } else if (c3 != '-') {
                                switch (c3) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c3);
                                        return 0.0f;
                                }
                            } else {
                                z3 = false;
                                c4 = read();
                                this.current = c4;
                                switch (c4) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c4);
                                        return 0.0f;
                                }
                            }
                            switch (this.current) {
                                case '0':
                                    while (true) {
                                        c6 = read();
                                        this.current = c6;
                                        switch (c6) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i4 = 0;
                                                while (true) {
                                                    if (i5 < 3) {
                                                        i5++;
                                                        i4 = (this.current - '0') + (i4 * 10);
                                                    }
                                                    c5 = read();
                                                    this.current = c5;
                                                    switch (c5) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            i5 = i4;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i4 = 0;
                                    while (true) {
                                        if (i5 < 3) {
                                            i5++;
                                            i4 = (this.current - '0') + (i4 * 10);
                                        }
                                        c5 = read();
                                        this.current = c5;
                                        switch (c5) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                i5 = i4;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        } else {
                            c3 = read();
                            this.current = c3;
                            if (c3 == '+') {
                                c4 = read();
                                this.current = c4;
                                switch (c4) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c4);
                                        return 0.0f;
                                }
                            } else if (c3 != '-') {
                                switch (c3) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c3);
                                        return 0.0f;
                                }
                            } else {
                                z3 = false;
                                c4 = read();
                                this.current = c4;
                                switch (c4) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c4);
                                        return 0.0f;
                                }
                            }
                            switch (this.current) {
                                case '0':
                                    while (true) {
                                        c6 = read();
                                        this.current = c6;
                                        switch (c6) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i4 = 0;
                                                while (true) {
                                                    if (i5 < 3) {
                                                        i5++;
                                                        i4 = (this.current - '0') + (i4 * 10);
                                                    }
                                                    c5 = read();
                                                    this.current = c5;
                                                    switch (c5) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            i5 = i4;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i4 = 0;
                                    while (true) {
                                        if (i5 < 3) {
                                            i5++;
                                            i4 = (this.current - '0') + (i4 * 10);
                                        }
                                        c5 = read();
                                        this.current = c5;
                                        switch (c5) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                i5 = i4;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        if (!z3) {
                            i5 = -i5;
                        }
                        int i12 = i5 + i2;
                        if (!z) {
                            i3 = -i3;
                        }
                        return buildFloat(i3, i12);
                    }
            }
        }

        public void skipNumberSeparator() {
            while (true) {
                int i = this.pos;
                if (i >= this.n) {
                    return;
                }
                char cCharAt = this.s.charAt(i);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != ' ' && cCharAt != ',') {
                    return;
                } else {
                    advance();
                }
            }
        }

        public void skipWhitespace() {
            while (true) {
                int i = this.pos;
                if (i >= this.n || !Character.isWhitespace(this.s.charAt(i))) {
                    return;
                } else {
                    advance();
                }
            }
        }
    }

    public static class Properties {
        Attributes atts;
        ArrayList<StyleSet> styles;

        public String getAttr(String str) {
            ArrayList<StyleSet> arrayList = this.styles;
            String style = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.styles.size();
                for (int i = 0; i < size; i++) {
                    style = this.styles.get(i).getStyle(str);
                    if (style != null) {
                        break;
                    }
                }
            }
            return style == null ? SvgHelper.getStringAttr(str, this.atts) : style;
        }

        public Float getFloat(String str, float f) {
            Float f2 = getFloat(str);
            return f2 == null ? Float.valueOf(f) : f2;
        }

        public Integer getHex(String str) {
            String attr = getAttr(str);
            if (attr == null) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(attr.substring(1), 16));
            } catch (NumberFormatException unused) {
                return SvgHelper.getColorByName(attr);
            }
        }

        public String getString(String str) {
            return getAttr(str);
        }

        private Properties(Attributes attributes, HashMap<String, StyleSet> map) {
            this.atts = attributes;
            String stringAttr = SvgHelper.getStringAttr("style", attributes);
            if (stringAttr != null) {
                ArrayList<StyleSet> arrayList = new ArrayList<>();
                this.styles = arrayList;
                arrayList.add(new StyleSet(stringAttr));
                return;
            }
            String stringAttr2 = SvgHelper.getStringAttr("class", attributes);
            if (stringAttr2 != null) {
                this.styles = new ArrayList<>();
                for (String str : stringAttr2.split(" ")) {
                    StyleSet styleSet = map.get(str.trim());
                    if (styleSet != null) {
                        this.styles.add(styleSet);
                    }
                }
            }
        }

        public Float getFloat(String str) {
            String attr = getAttr(str);
            if (attr == null) {
                return null;
            }
            try {
                return Float.valueOf(Float.parseFloat(attr));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
    }

    public static class RoundRect {
        RectF rect;
        float rx;

        public RoundRect(RectF rectF, float f) {
            this.rect = rectF;
            this.rx = f;
        }
    }

    public enum ScaleMode {
        Default,
        ByWidth
    }

    public static class StyleSet {
        HashMap<String, String> styleMap;

        public String getStyle(String str) {
            return this.styleMap.get(str);
        }

        private StyleSet(StyleSet styleSet) {
            HashMap<String, String> map = new HashMap<>();
            this.styleMap = map;
            map.putAll(styleSet.styleMap);
        }

        private StyleSet(String str) {
            this.styleMap = new HashMap<>();
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length == 2) {
                    this.styleMap.put(strArrSplit[0].trim(), strArrSplit[1].trim());
                }
            }
        }
    }

    public static class SvgDrawable extends Drawable {
        private static float gradientWidth;
        private static long lastUpdateTime;
        private static WeakReference<Drawable> shiftDrawable;
        private static Runnable shiftRunnable;
        private static float totalTranslation;
        private Paint backgroundPaint;
        private float colorAlpha;
        private int currentColorKey;
        private Theme.ResourcesProvider currentResourcesProvider;
        protected int height;
        private Integer overrideColor;
        private Paint overridePaint;
        private ImageReceiver parentImageReceiver;
        protected int width;
        private static final int[] parentPosition = new int[2];
        private static boolean lite = LiteMode.isEnabled(32);
        protected ArrayList<Object> commands = new ArrayList<>();
        protected HashMap<Object, Paint> paints = new HashMap<>();
        private final Bitmap[] backgroundBitmap = new Bitmap[3];
        private final Canvas[] backgroundCanvas = new Canvas[3];
        private final LinearGradient[] placeholderGradient = new LinearGradient[3];
        private final Matrix[] placeholderMatrix = new Matrix[3];
        private final int[] currentColor = new int[2];
        private float crossfadeAlpha = 1.0f;
        SparseArray<Paint> overridePaintByPosition = new SparseArray<>();
        private boolean aspectFill = true;
        private boolean aspectCenter = false;

        public void addCommand(Object obj, Paint paint) {
            this.commands.add(obj);
            this.paints.put(obj, new Paint(paint));
        }

        public static void updateLiteValues() {
            lite = LiteMode.isEnabled(32);
        }

        public void copyCommandFromPosition(int i) {
            ArrayList<Object> arrayList = this.commands;
            arrayList.add(arrayList.get(i));
        }

        @Override
        public void draw(Canvas canvas) {
            drawInternal(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
        }

        public void drawInternal(Canvas canvas, boolean z, int i, long j, float f, float f2, float f3, float f4) {
            long j2;
            int i2;
            int i3 = this.currentColorKey;
            if (i3 >= 0) {
                setupGradient(i3, this.currentResourcesProvider, this.colorAlpha, z);
            }
            float scale = getScale((int) f3, (int) f4);
            if (this.placeholderGradient[i] != null) {
                float f5 = gradientWidth;
                if (f5 > 0.0f && lite) {
                    if (z) {
                        long j3 = j - lastUpdateTime;
                        j2 = j3 <= 64 ? j3 : 64L;
                        if (j2 > 0) {
                            lastUpdateTime = j;
                            totalTranslation = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(j2, f5, 1800.0f, totalTranslation);
                            while (true) {
                                float f6 = totalTranslation;
                                float f7 = gradientWidth * 2.0f;
                                if (f6 < f7) {
                                    break;
                                } else {
                                    totalTranslation = f6 - f7;
                                }
                            }
                        }
                    } else if (shiftRunnable == null || shiftDrawable.get() == this) {
                        long j4 = j - lastUpdateTime;
                        j2 = j4 <= 64 ? j4 : 64L;
                        long j5 = j2 >= 0 ? j2 : 0L;
                        lastUpdateTime = j;
                        totalTranslation = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(j5, gradientWidth, 1800.0f, totalTranslation);
                        while (true) {
                            float f8 = totalTranslation;
                            float f9 = gradientWidth;
                            if (f8 < f9 / 2.0f) {
                                break;
                            } else {
                                totalTranslation = f8 - f9;
                            }
                        }
                        shiftDrawable = new WeakReference<>(this);
                        Runnable runnable = shiftRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        }
                        Emoji$$ExternalSyntheticLambda1 emoji$$ExternalSyntheticLambda1 = new Emoji$$ExternalSyntheticLambda1(22);
                        shiftRunnable = emoji$$ExternalSyntheticLambda1;
                        AndroidUtilities.runOnUIThread(emoji$$ExternalSyntheticLambda1, ((int) (1000.0f / AndroidUtilities.screenRefreshRate)) - 1);
                    }
                    ImageReceiver imageReceiver = this.parentImageReceiver;
                    if (imageReceiver == null || z) {
                        i2 = 0;
                    } else {
                        int[] iArr = parentPosition;
                        imageReceiver.getParentPosition(iArr);
                        i2 = iArr[0];
                    }
                    int i4 = z ? i + 1 : 0;
                    Matrix matrix = this.placeholderMatrix[i4];
                    if (matrix != null) {
                        matrix.reset();
                        if (z) {
                            this.placeholderMatrix[i4].postTranslate(((-i2) + totalTranslation) - f, 0.0f);
                        } else {
                            this.placeholderMatrix[i4].postTranslate(((-i2) + totalTranslation) - f, 0.0f);
                        }
                        float f10 = 1.0f / scale;
                        this.placeholderMatrix[i4].postScale(f10, f10);
                        this.placeholderGradient[i4].setLocalMatrix(this.placeholderMatrix[i4]);
                        ImageReceiver imageReceiver2 = this.parentImageReceiver;
                        if (imageReceiver2 != null && !z) {
                            imageReceiver2.invalidate();
                        }
                    }
                }
            }
            canvas.save();
            canvas.translate(f, f2);
            if (!this.aspectFill || this.aspectCenter) {
                canvas.translate(SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(this.width, scale, f3, 2.0f), SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(this.height, scale, f4, 2.0f));
            }
            canvas.scale(scale, scale);
            int size = this.commands.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = this.commands.get(i5);
                if (obj instanceof Matrix) {
                    canvas.save();
                    canvas.concat((Matrix) obj);
                } else if (obj == null) {
                    canvas.restore();
                } else {
                    Paint paint = this.overridePaintByPosition.get(i5);
                    if (paint == null) {
                        paint = this.overridePaint;
                    }
                    if (z) {
                        paint = this.backgroundPaint;
                    } else if (paint == null) {
                        paint = this.paints.get(obj);
                    }
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (this.crossfadeAlpha * alpha));
                    if (obj instanceof Path) {
                        canvas.drawPath((Path) obj, paint);
                    } else if (obj instanceof Rect) {
                        canvas.drawRect((Rect) obj, paint);
                    } else if (obj instanceof RectF) {
                        canvas.drawRect((RectF) obj, paint);
                    } else if (obj instanceof Line) {
                        Line line = (Line) obj;
                        canvas.drawLine(line.x1, line.y1, line.x2, line.y2, paint);
                    } else if (obj instanceof Circle) {
                        Circle circle = (Circle) obj;
                        canvas.drawCircle(circle.x1, circle.y1, circle.rad, paint);
                    } else if (obj instanceof Oval) {
                        canvas.drawOval(((Oval) obj).rect, paint);
                    } else if (obj instanceof RoundRect) {
                        RoundRect roundRect = (RoundRect) obj;
                        RectF rectF = roundRect.rect;
                        float f11 = roundRect.rx;
                        canvas.drawRoundRect(rectF, f11, f11, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            canvas.restore();
        }

        @Override
        public int getIntrinsicHeight() {
            return this.width;
        }

        @Override
        public int getIntrinsicWidth() {
            return this.height;
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        public float getScale(int i, int i2) {
            float f = i / this.width;
            float f2 = i2 / this.height;
            return this.aspectFill ? Math.max(f, f2) : Math.min(f, f2);
        }

        public void overrideWidthAndHeight(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        @Override
        public void setAlpha(int i) {
            this.crossfadeAlpha = i / 255.0f;
        }

        public void setAspectCenter(boolean z) {
            this.aspectCenter = z;
        }

        public void setAspectFill(boolean z) {
            this.aspectFill = z;
        }

        public void setColor(int i) {
            this.overrideColor = Integer.valueOf(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public void setColorKey(int i) {
            this.currentColorKey = i;
        }

        public void setPaint(Paint paint) {
            this.overridePaint = paint;
        }

        public void setParent(ImageReceiver imageReceiver) {
            this.parentImageReceiver = imageReceiver;
        }

        public void setupGradient(int i, float f, boolean z) {
            setupGradient(i, null, f, z);
        }

        public SvgDrawable clone() {
            SvgDrawable svgDrawable = new SvgDrawable();
            for (int i = 0; i < this.commands.size(); i++) {
                svgDrawable.commands.add(this.commands.get(i));
                Paint paint = this.paints.get(this.commands.get(i));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    svgDrawable.paints.put(this.commands.get(i), paint2);
                }
            }
            svgDrawable.width = this.width;
            svgDrawable.height = this.height;
            return svgDrawable;
        }

        public void setColorKey(int i, Theme.ResourcesProvider resourcesProvider) {
            this.currentColorKey = i;
            this.currentResourcesProvider = resourcesProvider;
        }

        public void setPaint(Paint paint, int i) {
            this.overridePaintByPosition.put(i, paint);
        }

        public void setupGradient(int i, Theme.ResourcesProvider resourcesProvider, float f, boolean z) {
            Shader bitmapShader;
            Integer num = this.overrideColor;
            int color = num == null ? Theme.getColor(i, resourcesProvider) : num.intValue();
            this.currentResourcesProvider = resourcesProvider;
            int[] iArr = this.currentColor;
            if (iArr[z ? 1 : 0] != color) {
                this.colorAlpha = f;
                this.currentColorKey = i;
                iArr[z ? 1 : 0] = color;
                gradientWidth = AndroidUtilities.displaySize.x * 2;
                if (!lite) {
                    int alphaComponent = ColorUtils.setAlphaComponent(color, 70);
                    if (z) {
                        if (this.backgroundPaint == null) {
                            this.backgroundPaint = new Paint(1);
                        }
                        this.backgroundPaint.setShader(null);
                        this.backgroundPaint.setColor(alphaComponent);
                        return;
                    }
                    for (Paint paint : this.paints.values()) {
                        paint.setShader(null);
                        paint.setColor(alphaComponent);
                    }
                    return;
                }
                float fDp = AndroidUtilities.dp(180.0f) / gradientWidth;
                int iArgb = Color.argb((int) ((Color.alpha(color) / 2) * this.colorAlpha), Color.red(color), Color.green(color), Color.blue(color));
                float f2 = (1.0f - fDp) / 2.0f;
                LinearGradient[] linearGradientArr = this.placeholderGradient;
                float f3 = fDp / 2.0f;
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                linearGradientArr[z ? 1 : 0] = new LinearGradient(0.0f, 0.0f, gradientWidth, 0.0f, new int[]{0, 0, iArgb, 0, 0}, new float[]{0.0f, f2 - f3, f2, f3 + f2, 1.0f}, tileMode);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    bitmapShader = new LinearGradient(0.0f, 0.0f, gradientWidth, 0.0f, new int[]{iArgb, iArgb}, (float[]) null, tileMode);
                } else {
                    Bitmap[] bitmapArr = this.backgroundBitmap;
                    if (bitmapArr[z ? 1 : 0] == null) {
                        bitmapArr[z ? 1 : 0] = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        this.backgroundCanvas[z ? 1 : 0] = new Canvas(this.backgroundBitmap[z ? 1 : 0]);
                    }
                    this.backgroundCanvas[z ? 1 : 0].drawColor(iArgb);
                    bitmapShader = new BitmapShader(this.backgroundBitmap[z ? 1 : 0], tileMode, tileMode);
                }
                this.placeholderMatrix[z ? 1 : 0] = new Matrix();
                this.placeholderGradient[z ? 1 : 0].setLocalMatrix(this.placeholderMatrix[z ? 1 : 0]);
                if (z) {
                    if (this.backgroundPaint == null) {
                        this.backgroundPaint = new Paint(1);
                    }
                    if (i2 <= 22) {
                        this.backgroundPaint.setShader(bitmapShader);
                        return;
                    } else {
                        this.backgroundPaint.setShader(new ComposeShader(this.placeholderGradient[z ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                        return;
                    }
                }
                for (Paint paint2 : this.paints.values()) {
                    if (Build.VERSION.SDK_INT <= 22) {
                        paint2.setShader(bitmapShader);
                    } else {
                        paint2.setShader(new ComposeShader(this.placeholderGradient[z ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                    }
                }
            }
        }

        public void addCommand(Object obj) {
            this.commands.add(obj);
        }
    }

    public interface SvgResult {
        Bitmap getBitmap();

        SvgDrawable getDrawable();

        List<WallpaperGiftPatternPosition> getGiftPatternPositions();
    }

    static {
        int i = 0;
        while (true) {
            double[] dArr = pow10;
            if (i >= dArr.length) {
                SPLIT_BOUNDARY = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            } else {
                dArr[i] = Math.pow(10.0d, i);
                i++;
            }
        }
    }

    private static float[] arcToBeziers(double d, double d2) {
        int iCeil = (int) Math.ceil((Math.abs(d2) * 2.0d) / 3.141592653589793d);
        double d3 = d2 / ((double) iCeil);
        double d4 = d3 / 2.0d;
        double dSin = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i = 0;
        int i2 = 0;
        while (i < iCeil) {
            double d5 = (((double) i) * d3) + d;
            double dCos = Math.cos(d5);
            double dSin2 = Math.sin(d5);
            float[] fArr2 = fArr;
            fArr2[i2] = (float) (dCos - (dSin * dSin2));
            fArr2[i2 + 1] = (float) ((dCos * dSin) + dSin2);
            double d6 = d5 + d3;
            double dCos2 = Math.cos(d6);
            double dSin3 = Math.sin(d6);
            fArr2[i2 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i2 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i3 = i2 + 5;
            fArr2[i2 + 4] = (float) dCos2;
            i2 += 6;
            fArr2[i3] = (float) dSin3;
            i++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    private static double checkedArcCos(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        if (d > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d);
    }

    public static String decompress(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            sb.append('M');
            for (byte b : bArr) {
                int i = b & 255;
                if (i >= 192) {
                    sb.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i - 192));
                } else {
                    if (i >= 128) {
                        sb.append(',');
                    } else if (i >= 64) {
                        sb.append('-');
                    }
                    sb.append(b & 63);
                }
            }
            sb.append('z');
            return sb.toString();
        } catch (Exception e) {
            FileLog.e(e);
            return "";
        }
    }

    public static Path doPath(String str) {
        char c;
        float fNextFloat;
        float fNextFloat2;
        float fNextFloat3;
        if (ApplicationLoader.isAndroidTestEnvironment()) {
            return new Path();
        }
        int length = str.length();
        ParserHelper parserHelper = new ParserHelper(str, 0);
        parserHelper.skipWhitespace();
        Path path = new Path();
        char c2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (true) {
            int i = parserHelper.pos;
            if (i >= length) {
                return path;
            }
            char cCharAt = str.charAt(i);
            switch (cCharAt) {
                case '+':
                case '-':
                case '.':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    if (c2 != 'm' && c2 != 'M') {
                        if (c2 != 'c' && c2 != 'C' && c2 != 'l' && c2 != 'L' && c2 != 's' && c2 != 'S' && c2 != 'h' && c2 != 'H' && c2 != 'v' && c2 != 'V' && c2 != 'q' && c2 != 'Q' && c2 != 'a' && c2 != 'A' && c2 != 't' && c2 != 'T') {
                        }
                        c = c2;
                        break;
                    } else {
                        c = c2;
                        c2 = (char) (c2 - 1);
                        break;
                    }
                case ',':
                case '/':
                default:
                    parserHelper.advance();
                    c2 = cCharAt;
                    c = c2;
                    break;
            }
            boolean z = true;
            switch (c2) {
                case 'A':
                case 'a':
                    float fNextFloat4 = parserHelper.nextFloat();
                    float fNextFloat5 = parserHelper.nextFloat();
                    float f7 = f3;
                    float fNextFloat6 = parserHelper.nextFloat();
                    boolean z2 = ((int) parserHelper.nextFloat()) == 1;
                    boolean z3 = ((int) parserHelper.nextFloat()) == 1;
                    float fNextFloat7 = parserHelper.nextFloat();
                    float fNextFloat8 = parserHelper.nextFloat();
                    if (c2 == 'a') {
                        fNextFloat7 += f;
                        fNextFloat8 += f2;
                    }
                    float f8 = f;
                    float f9 = f2;
                    float f10 = fNextFloat7;
                    boolean z4 = z2;
                    float f11 = fNextFloat8;
                    drawArc(path, f8, f9, f10, f11, fNextFloat4, fNextFloat5, fNextFloat6, z4, z3);
                    f2 = f11;
                    f = f10;
                    fNextFloat = f7;
                    fNextFloat2 = f4;
                    f4 = f5;
                    f3 = f6;
                    z = false;
                    break;
                case 'C':
                case 'c':
                    float fNextFloat9 = parserHelper.nextFloat();
                    float fNextFloat10 = parserHelper.nextFloat();
                    float fNextFloat11 = parserHelper.nextFloat();
                    float fNextFloat12 = parserHelper.nextFloat();
                    float fNextFloat13 = parserHelper.nextFloat();
                    float fNextFloat14 = parserHelper.nextFloat();
                    if (c2 == 'c') {
                        fNextFloat9 += f;
                        fNextFloat11 += f;
                        fNextFloat13 += f;
                        fNextFloat10 += f2;
                        fNextFloat12 += f2;
                        fNextFloat14 += f2;
                    }
                    float f12 = fNextFloat9;
                    float f13 = fNextFloat10;
                    float f14 = fNextFloat11;
                    float f15 = fNextFloat12;
                    float f16 = fNextFloat13;
                    float f17 = fNextFloat14;
                    path.cubicTo(f12, f13, f14, f15, f16, f17);
                    fNextFloat = f3;
                    f3 = f15;
                    fNextFloat2 = f4;
                    f = f16;
                    f2 = f17;
                    f4 = f14;
                    break;
                case 'H':
                case 'h':
                    float fNextFloat15 = parserHelper.nextFloat();
                    if (c2 == 'h') {
                        path.rLineTo(fNextFloat15, 0.0f);
                        f += fNextFloat15;
                    } else {
                        path.lineTo(fNextFloat15, f2);
                        f = fNextFloat15;
                    }
                    fNextFloat = f3;
                    fNextFloat2 = f4;
                    f4 = f5;
                    f3 = f6;
                    z = false;
                    break;
                case 'L':
                case 'l':
                    float fNextFloat16 = parserHelper.nextFloat();
                    float fNextFloat17 = parserHelper.nextFloat();
                    if (c2 == 'l') {
                        path.rLineTo(fNextFloat16, fNextFloat17);
                        f += fNextFloat16;
                        f2 += fNextFloat17;
                    } else {
                        path.lineTo(fNextFloat16, fNextFloat17);
                        f = fNextFloat16;
                        f2 = fNextFloat17;
                    }
                    fNextFloat = f3;
                    fNextFloat2 = f4;
                    f4 = f5;
                    f3 = f6;
                    z = false;
                    break;
                case 'M':
                case 'm':
                    fNextFloat2 = parserHelper.nextFloat();
                    fNextFloat = parserHelper.nextFloat();
                    if (c2 == 'm') {
                        f4 += fNextFloat2;
                        f3 += fNextFloat;
                        path.rMoveTo(fNextFloat2, fNextFloat);
                        f = fNextFloat2 + f;
                        f2 += fNextFloat;
                        fNextFloat = f3;
                        fNextFloat2 = f4;
                    } else {
                        path.moveTo(fNextFloat2, fNextFloat);
                        f = fNextFloat2;
                        f2 = fNextFloat;
                    }
                    f4 = f5;
                    f3 = f6;
                    z = false;
                    break;
                case 'Q':
                case 'q':
                    float fNextFloat18 = parserHelper.nextFloat();
                    float fNextFloat19 = parserHelper.nextFloat();
                    float fNextFloat20 = parserHelper.nextFloat();
                    fNextFloat3 = parserHelper.nextFloat();
                    if (c2 == 'q') {
                        fNextFloat18 += f;
                        fNextFloat19 += f2;
                        fNextFloat20 += f;
                        fNextFloat3 += f2;
                    }
                    path.quadTo(fNextFloat18, fNextFloat19, fNextFloat20, fNextFloat3);
                    float f18 = f4;
                    f4 = fNextFloat18;
                    fNextFloat2 = f18;
                    float f19 = f3;
                    f3 = fNextFloat19;
                    fNextFloat = f19;
                    f = fNextFloat20;
                    f2 = fNextFloat3;
                    break;
                case 'S':
                case 's':
                    float fNextFloat21 = parserHelper.nextFloat();
                    float fNextFloat22 = parserHelper.nextFloat();
                    float fNextFloat23 = parserHelper.nextFloat();
                    float fNextFloat24 = parserHelper.nextFloat();
                    if (c2 == 's') {
                        fNextFloat21 += f;
                        fNextFloat23 += f;
                        fNextFloat22 += f2;
                        fNextFloat24 += f2;
                    }
                    float f20 = (f * 2.0f) - f5;
                    float f21 = (f2 * 2.0f) - f6;
                    float f22 = fNextFloat21;
                    float f23 = fNextFloat22;
                    float f24 = fNextFloat23;
                    fNextFloat3 = fNextFloat24;
                    path.cubicTo(f20, f21, f22, f23, f24, fNextFloat3);
                    float f25 = f3;
                    f3 = f23;
                    fNextFloat = f25;
                    f = f24;
                    fNextFloat2 = f4;
                    f4 = f22;
                    f2 = fNextFloat3;
                    break;
                case 'T':
                case 't':
                    float fNextFloat25 = parserHelper.nextFloat();
                    float fNextFloat26 = parserHelper.nextFloat();
                    if (c2 == 't') {
                        fNextFloat25 += f;
                        fNextFloat26 += f2;
                    }
                    float f26 = (f * 2.0f) - f5;
                    float f27 = (f2 * 2.0f) - f6;
                    path.quadTo(f26, f27, fNextFloat25, fNextFloat26);
                    f = fNextFloat25;
                    fNextFloat2 = f4;
                    f4 = f26;
                    fNextFloat = f3;
                    f3 = f27;
                    f2 = fNextFloat26;
                    break;
                case 'V':
                case 'v':
                    float fNextFloat27 = parserHelper.nextFloat();
                    if (c2 == 'v') {
                        path.rLineTo(0.0f, fNextFloat27);
                        f2 += fNextFloat27;
                    } else {
                        path.lineTo(f, fNextFloat27);
                        f2 = fNextFloat27;
                    }
                    fNextFloat = f3;
                    fNextFloat2 = f4;
                    f4 = f5;
                    f3 = f6;
                    z = false;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f4, f3);
                    f2 = f3;
                    fNextFloat = f2;
                    fNextFloat2 = f4;
                    f = fNextFloat2;
                    break;
                default:
                    fNextFloat = f3;
                    fNextFloat2 = f4;
                    f4 = f5;
                    f3 = f6;
                    z = false;
                    break;
            }
            if (z) {
                f6 = f3;
                f5 = f4;
            } else {
                f5 = f;
                f6 = f2;
            }
            parserHelper.skipWhitespace();
            f4 = fNextFloat2;
            f3 = fNextFloat;
            c2 = c;
        }
    }

    private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        if (f == f3 && f2 == f4) {
            return;
        }
        if (f5 == 0.0f || f6 == 0.0f) {
            path.lineTo(f3, f4);
            return;
        }
        float fAbs = Math.abs(f5);
        float fAbs2 = Math.abs(f6);
        double radians = Math.toRadians(((double) f7) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f3)) / 2.0d;
        double d2 = ((double) (f2 - f4)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (d2 * dCos) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = d15 * d4;
        double d17 = fAbs2;
        double d18 = (d16 / d17) * dSqrt2;
        double d19 = dSqrt2 * (-((d17 * d3) / d15));
        double d20 = ((dCos * d18) - (dSin * d19)) + (((double) (f + f3)) / 2.0d);
        double d21 = (dCos * d19) + (dSin * d18) + (((double) (f2 + f4)) / 2.0d);
        double d22 = (d3 - d18) / d15;
        double d23 = (d4 - d19) / d17;
        double d24 = ((-d3) - d18) / d15;
        double d25 = ((-d4) - d19) / d17;
        double d26 = (d23 * d23) + (d22 * d22);
        double dAcos = Math.acos(d22 / Math.sqrt(d26)) * (d23 < 0.0d ? -1.0d : 1.0d);
        double dCheckedArcCos = ((d22 * d25) - (d23 * d24) < 0.0d ? -1.0d : 1.0d) * checkedArcCos(((d23 * d25) + (d22 * d24)) / Math.sqrt(((d25 * d25) + (d24 * d24)) * d26));
        if (dCheckedArcCos == 0.0d) {
            path.lineTo(f3, f4);
            return;
        }
        if (!z2 && dCheckedArcCos > 0.0d) {
            dCheckedArcCos -= 6.283185307179586d;
        } else if (z2 && dCheckedArcCos < 0.0d) {
            dCheckedArcCos += 6.283185307179586d;
        }
        float[] fArrArcToBeziers = arcToBeziers(dAcos % 6.283185307179586d, dCheckedArcCos % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f7);
        matrix.postTranslate((float) d20, (float) d21);
        matrix.mapPoints(fArrArcToBeziers);
        fArrArcToBeziers[fArrArcToBeziers.length - 2] = f3;
        fArrArcToBeziers[fArrArcToBeziers.length - 1] = f4;
        for (int i = 0; i < fArrArcToBeziers.length; i += 6) {
            path.cubicTo(fArrArcToBeziers[i], fArrArcToBeziers[i + 1], fArrArcToBeziers[i + 2], fArrArcToBeziers[i + 3], fArrArcToBeziers[i + 4], fArrArcToBeziers[i + 5]);
        }
    }

    public static Bitmap getBitmap(int i, int i2, int i3, int i4) {
        return getBitmap(i, i2, i3, i4, 1.0f);
    }

    public static Bitmap getBitmapByPathOnly(String str, int i, int i2, int i3, int i4) {
        try {
            Path pathDoPath = doPath(str);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(i3 / i, i4 / i2);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(pathDoPath, paint);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Integer getColorByName(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "yellow":
                return -256;
            case "red":
                return -65536;
            case "blue":
                return -16776961;
            case "cyan":
                return -16711681;
            case "gray":
                return -7829368;
            case "black":
                return -16777216;
            case "green":
                return -16711936;
            case "white":
                return -1;
            case "magenta":
                return -65281;
            default:
                return null;
        }
    }

    public static SvgDrawable getDrawable(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(0, 0, (Integer) null, true, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return sVGHandler.getDrawable();
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static SvgDrawable getDrawableByPath(String str, int i, int i2) {
        try {
            Path pathDoPath = doPath(str);
            SvgDrawable svgDrawable = new SvgDrawable();
            svgDrawable.commands.add(pathDoPath);
            svgDrawable.paints.put(pathDoPath, new Paint(1));
            svgDrawable.width = i;
            svgDrawable.height = i2;
            return svgDrawable;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Float getFloatAttr(String str, Attributes attributes) {
        return getFloatAttr(str, attributes, null);
    }

    private static Integer getHexAttr(String str, Attributes attributes) {
        String stringAttr = getStringAttr(str, attributes);
        if (stringAttr == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(stringAttr.substring(1), 16));
        } catch (NumberFormatException unused) {
            return getColorByName(stringAttr);
        }
    }

    public static NumberParse getNumberParseAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return parseNumbers(attributes.getValue(i));
            }
        }
        return null;
    }

    public static String getStringAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public static SvgResult getSvgBitmap(File file, int i, int i2, boolean z) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                SVGHandler sVGHandler = new SVGHandler(i, i2, z ? -1 : null, false, 1.0f);
                if (!z) {
                    sVGHandler.alphaOnly = true;
                }
                xMLReader.setContentHandler(sVGHandler);
                xMLReader.parse(new InputSource(fileInputStream));
                fileInputStream.close();
                return sVGHandler;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    private static NumberParse parseNumbers(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int length2 = 0;
        boolean z = false;
        for (int i = 1; i < length; i++) {
            if (z) {
                z = false;
            } else {
                char cCharAt = str.charAt(i);
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (cCharAt != '-' || str.charAt(i - 1) != 'e') {
                            String strSubstring = str.substring(length2, i);
                            if (strSubstring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(strSubstring)));
                                if (cCharAt == '-') {
                                    length2 = i;
                                } else {
                                    length2 = i + 1;
                                    z = true;
                                }
                            } else {
                                length2++;
                            }
                        }
                        break;
                    case ')':
                    case 'A':
                    case 'C':
                    case 'H':
                    case 'L':
                    case 'M':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'Z':
                    case 'a':
                    case 'c':
                    case 'h':
                    case 'l':
                    case 'm':
                    case 'q':
                    case 's':
                    case 't':
                    case 'v':
                    case 'z':
                        String strSubstring2 = str.substring(length2, i);
                        if (strSubstring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(strSubstring2)));
                        }
                        return new NumberParse(arrayList, i);
                }
            }
        }
        String strSubstring3 = str.substring(length2);
        if (strSubstring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(strSubstring3)));
            } catch (NumberFormatException unused) {
            }
            length2 = str.length();
        }
        return new NumberParse(arrayList, length2);
    }

    public static Matrix parseTransform(String str) {
        Matrix matrix = new Matrix();
        Iterator<String> it = splitSvgTransforms(str).iterator();
        while (it.hasNext()) {
            Matrix transformCommand = parseTransformCommand(it.next());
            if (transformCommand != null) {
                matrix.preConcat(transformCommand);
            }
        }
        return matrix;
    }

    private static Matrix parseTransformCommand(String str) {
        float fFloatValue;
        if (str.startsWith("matrix(")) {
            NumberParse numbers = parseNumbers(str.substring(7));
            if (numbers.numbers.size() != 6) {
                return null;
            }
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{((Float) numbers.numbers.get(0)).floatValue(), ((Float) numbers.numbers.get(2)).floatValue(), ((Float) numbers.numbers.get(4)).floatValue(), ((Float) numbers.numbers.get(1)).floatValue(), ((Float) numbers.numbers.get(3)).floatValue(), ((Float) numbers.numbers.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
            return matrix;
        }
        if (str.startsWith("translate(")) {
            NumberParse numbers2 = parseNumbers(str.substring(10));
            if (numbers2.numbers.size() <= 0) {
                return null;
            }
            float fFloatValue2 = ((Float) numbers2.numbers.get(0)).floatValue();
            fFloatValue = numbers2.numbers.size() > 1 ? ((Float) numbers2.numbers.get(1)).floatValue() : 0.0f;
            Matrix matrix2 = new Matrix();
            matrix2.postTranslate(fFloatValue2, fFloatValue);
            return matrix2;
        }
        if (str.startsWith("scale(")) {
            NumberParse numbers3 = parseNumbers(str.substring(6));
            if (numbers3.numbers.size() <= 0) {
                return null;
            }
            float fFloatValue3 = ((Float) numbers3.numbers.get(0)).floatValue();
            fFloatValue = numbers3.numbers.size() > 1 ? ((Float) numbers3.numbers.get(1)).floatValue() : 0.0f;
            Matrix matrix3 = new Matrix();
            matrix3.postScale(fFloatValue3, fFloatValue);
            return matrix3;
        }
        if (str.startsWith("skewX(")) {
            NumberParse numbers4 = parseNumbers(str.substring(6));
            if (numbers4.numbers.size() <= 0) {
                return null;
            }
            float fFloatValue4 = ((Float) numbers4.numbers.get(0)).floatValue();
            Matrix matrix4 = new Matrix();
            matrix4.postSkew((float) Math.tan(fFloatValue4), 0.0f);
            return matrix4;
        }
        if (str.startsWith("skewY(")) {
            NumberParse numbers5 = parseNumbers(str.substring(6));
            if (numbers5.numbers.size() <= 0) {
                return null;
            }
            float fFloatValue5 = ((Float) numbers5.numbers.get(0)).floatValue();
            Matrix matrix5 = new Matrix();
            matrix5.postSkew(0.0f, (float) Math.tan(fFloatValue5));
            return matrix5;
        }
        if (!str.startsWith("rotate(")) {
            return null;
        }
        NumberParse numbers6 = parseNumbers(str.substring(7));
        if (numbers6.numbers.size() <= 0) {
            return null;
        }
        Matrix matrix6 = new Matrix();
        float fFloatValue6 = ((Float) numbers6.numbers.get(0)).floatValue();
        if (numbers6.numbers.size() > 2) {
            matrix6.postRotate(fFloatValue6, ((Float) numbers6.numbers.get(1)).floatValue(), ((Float) numbers6.numbers.get(2)).floatValue());
            return matrix6;
        }
        matrix6.postRotate(fFloatValue6);
        return matrix6;
    }

    private static List<String> splitSvgTransforms(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] strArrSplit = SPLIT_BOUNDARY.split(strTrim);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            String strTrim2 = str2.trim();
            if (!strTrim2.isEmpty()) {
                arrayList.add(strTrim2);
            }
        }
        return arrayList;
    }

    public static class SVGHandler extends DefaultHandler implements SvgResult {
        private boolean alphaOnly;
        private Bitmap bitmap;
        private boolean boundsMode;
        private Canvas canvas;
        private int desiredHeight;
        private int desiredWidth;
        private SvgDrawable drawable;
        private float globalScale;
        private HashMap<String, StyleSet> globalStyles;
        private boolean insideGiftRect;
        private int insideGiftRectDepth;
        private List<WallpaperGiftPatternPosition> insideGiftRectPositions;
        private Paint paint;
        private Integer paintColor;
        boolean pushed;
        private RectF rect;
        private RectF rectTmp;
        private float scale;
        private ScaleMode scaleMode;
        private StringBuilder styles;

        private void doColor(Properties properties, Integer num, boolean z) {
            Integer num2 = this.paintColor;
            if (num2 != null) {
                this.paint.setColor(num2.intValue());
            } else {
                this.paint.setColor((num.intValue() & 16777215) | (-16777216));
            }
            Float f = properties.getFloat("opacity");
            if (f == null) {
                f = properties.getFloat(z ? "fill-opacity" : "stroke-opacity");
            }
            if (f == null) {
                this.paint.setAlpha(255);
            } else {
                this.paint.setAlpha((int) (f.floatValue() * 255.0f));
            }
        }

        private boolean doFill(Properties properties) {
            if ("none".equals(properties.getString("display"))) {
                return false;
            }
            String string = properties.getString("fill");
            if (string != null && string.startsWith("url(#")) {
                string.substring(5, string.length() - 1);
                return false;
            }
            Integer hex = properties.getHex("fill");
            if (hex != null) {
                doColor(properties, hex, true);
                this.paint.setStyle(Paint.Style.FILL);
                return true;
            }
            if (properties.getString("fill") != null || properties.getString("stroke") != null) {
                return false;
            }
            this.paint.setStyle(Paint.Style.FILL);
            Integer num = this.paintColor;
            if (num != null) {
                this.paint.setColor(num.intValue());
            } else {
                this.paint.setColor(-16777216);
            }
            return true;
        }

        private boolean doStroke(Properties properties) {
            Integer hex;
            if ("none".equals(properties.getString("display")) || (hex = properties.getHex("stroke")) == null) {
                return false;
            }
            doColor(properties, hex, false);
            Float f = properties.getFloat("stroke-width");
            if (f != null) {
                this.paint.setStrokeWidth(f.floatValue());
            }
            String string = properties.getString("stroke-linecap");
            if ("round".equals(string)) {
                this.paint.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(string)) {
                this.paint.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(string)) {
                this.paint.setStrokeCap(Paint.Cap.BUTT);
            }
            String string2 = properties.getString("stroke-linejoin");
            if ("miter".equals(string2)) {
                this.paint.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(string2)) {
                this.paint.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(string2)) {
                this.paint.setStrokeJoin(Paint.Join.BEVEL);
            }
            this.paint.setStyle(Paint.Style.STROKE);
            return true;
        }

        private void popTransform() {
            if (this.pushed) {
                SvgDrawable svgDrawable = this.drawable;
                if (svgDrawable != null) {
                    svgDrawable.addCommand(null);
                } else {
                    this.canvas.restore();
                }
            }
        }

        private void pushTransform(Attributes attributes) {
            String stringAttr = SvgHelper.getStringAttr("transform", attributes);
            boolean z = stringAttr != null;
            this.pushed = z;
            if (z) {
                Matrix transform = SvgHelper.parseTransform(stringAttr);
                SvgDrawable svgDrawable = this.drawable;
                if (svgDrawable != null) {
                    svgDrawable.addCommand(transform);
                } else {
                    this.canvas.save();
                    this.canvas.concat(transform);
                }
            }
        }

        @Override
        public void characters(char[] cArr, int i, int i2) {
            StringBuilder sb = this.styles;
            if (sb != null) {
                sb.append(cArr, i, i2);
            }
        }

        @Override
        public void endDocument() {
        }

        @Override
        public void endElement(String str, String str2, String str3) {
            int iIndexOf;
            if (this.insideGiftRect) {
                int i = this.insideGiftRectDepth - 1;
                this.insideGiftRectDepth = i;
                if (i == 0) {
                    this.insideGiftRect = false;
                }
                return;
            }
            str2.getClass();
            switch (str2) {
                case "g":
                case "defs":
                case "clipPath":
                    this.boundsMode = false;
                    break;
                case "style":
                    StringBuilder sb = this.styles;
                    if (sb != null) {
                        String[] strArrSplit = sb.toString().split("\\}");
                        int i2 = 0;
                        while (true) {
                            if (i2 >= strArrSplit.length) {
                                this.styles = null;
                            } else {
                                String strReplace = strArrSplit[i2].trim().replace("\t", "").replace("\n", "");
                                strArrSplit[i2] = strReplace;
                                if (strReplace.length() != 0 && strArrSplit[i2].charAt(0) == '.' && (iIndexOf = strArrSplit[i2].indexOf(123)) >= 0) {
                                    this.globalStyles.put(strArrSplit[i2].substring(1, iIndexOf).trim(), new StyleSet(strArrSplit[i2].substring(iIndexOf + 1)));
                                }
                                i2++;
                            }
                            break;
                        }
                    }
                    break;
            }
        }

        @Override
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        @Override
        public SvgDrawable getDrawable() {
            return this.drawable;
        }

        @Override
        public List<WallpaperGiftPatternPosition> getGiftPatternPositions() {
            return this.insideGiftRectPositions;
        }

        @Override
        public void startDocument() {
        }

        @Override
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            String stringAttr;
            int i;
            WallpaperGiftPatternPosition wallpaperGiftPatternPosition = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            if (!"g".equals(str3) || this.insideGiftRect) {
                if (this.insideGiftRect) {
                    this.insideGiftRectDepth++;
                    if ("rect".equals(str3)) {
                        float f = this.scale;
                        try {
                            float f2 = Float.parseFloat(attributes.getValue("x"));
                            float f3 = Float.parseFloat(attributes.getValue("y"));
                            RectF rectF = new RectF(f2, f3, Float.parseFloat(attributes.getValue("width")) + f2, Float.parseFloat(attributes.getValue("height")) + f3);
                            Matrix transform = SvgHelper.parseTransform(attributes.getValue("transform"));
                            transform.postScale(f, f);
                            wallpaperGiftPatternPosition = new WallpaperGiftPatternPosition(rectF, transform);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        if (wallpaperGiftPatternPosition != null) {
                            if (this.insideGiftRectPositions == null) {
                                this.insideGiftRectPositions = new ArrayList();
                            }
                            this.insideGiftRectPositions.add(wallpaperGiftPatternPosition);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if ("GiftPatterns".equals(attributes.getValue("id"))) {
                this.insideGiftRect = true;
                this.insideGiftRectDepth = 1;
            }
            if (!this.boundsMode || str2.equals("style")) {
                str2.getClass();
                switch (str2) {
                    case "ellipse":
                        Float floatAttr = SvgHelper.getFloatAttr("cx", attributes);
                        Float floatAttr2 = SvgHelper.getFloatAttr("cy", attributes);
                        Float floatAttr3 = SvgHelper.getFloatAttr("rx", attributes);
                        Float floatAttr4 = SvgHelper.getFloatAttr("ry", attributes);
                        if (floatAttr != null && floatAttr2 != null && floatAttr3 != null && floatAttr4 != null) {
                            pushTransform(attributes);
                            Properties properties = new Properties(attributes, this.globalStyles);
                            this.rect.set(floatAttr.floatValue() - floatAttr3.floatValue(), floatAttr2.floatValue() - floatAttr4.floatValue(), floatAttr3.floatValue() + floatAttr.floatValue(), floatAttr4.floatValue() + floatAttr2.floatValue());
                            if (doFill(properties)) {
                                SvgDrawable svgDrawable = this.drawable;
                                if (svgDrawable != null) {
                                    svgDrawable.addCommand(new Oval(this.rect), this.paint);
                                } else {
                                    this.canvas.drawOval(this.rect, this.paint);
                                }
                            }
                            if (doStroke(properties)) {
                                SvgDrawable svgDrawable2 = this.drawable;
                                if (svgDrawable2 != null) {
                                    svgDrawable2.addCommand(new Oval(this.rect), this.paint);
                                } else {
                                    this.canvas.drawOval(this.rect, this.paint);
                                }
                            }
                            popTransform();
                            break;
                        }
                        break;
                    case "circle":
                        Float floatAttr5 = SvgHelper.getFloatAttr("cx", attributes);
                        Float floatAttr6 = SvgHelper.getFloatAttr("cy", attributes);
                        Float floatAttr7 = SvgHelper.getFloatAttr("r", attributes);
                        if (floatAttr5 != null && floatAttr6 != null && floatAttr7 != null) {
                            pushTransform(attributes);
                            Properties properties2 = new Properties(attributes, this.globalStyles);
                            if (doFill(properties2)) {
                                SvgDrawable svgDrawable3 = this.drawable;
                                if (svgDrawable3 != null) {
                                    svgDrawable3.addCommand(new Circle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue()), this.paint);
                                } else {
                                    this.canvas.drawCircle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue(), this.paint);
                                }
                            }
                            if (doStroke(properties2)) {
                                SvgDrawable svgDrawable4 = this.drawable;
                                if (svgDrawable4 != null) {
                                    svgDrawable4.addCommand(new Circle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue()), this.paint);
                                } else {
                                    this.canvas.drawCircle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue(), this.paint);
                                }
                            }
                            popTransform();
                            break;
                        }
                        break;
                    case "polygon":
                    case "polyline":
                        NumberParse numberParseAttr = SvgHelper.getNumberParseAttr("points", attributes);
                        if (numberParseAttr != null) {
                            Path path = new Path();
                            ArrayList arrayList = numberParseAttr.numbers;
                            if (arrayList.size() > 1) {
                                pushTransform(attributes);
                                Properties properties3 = new Properties(attributes, this.globalStyles);
                                path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                                for (int i2 = 2; i2 < arrayList.size(); i2 += 2) {
                                    path.lineTo(((Float) arrayList.get(i2)).floatValue(), ((Float) arrayList.get(i2 + 1)).floatValue());
                                }
                                if (str2.equals("polygon")) {
                                    path.close();
                                }
                                if (doFill(properties3)) {
                                    SvgDrawable svgDrawable5 = this.drawable;
                                    if (svgDrawable5 != null) {
                                        svgDrawable5.addCommand(path, this.paint);
                                    } else {
                                        this.canvas.drawPath(path, this.paint);
                                    }
                                }
                                if (doStroke(properties3)) {
                                    SvgDrawable svgDrawable6 = this.drawable;
                                    if (svgDrawable6 != null) {
                                        svgDrawable6.addCommand(path, this.paint);
                                    } else {
                                        this.canvas.drawPath(path, this.paint);
                                    }
                                }
                                popTransform();
                            }
                            break;
                        }
                        break;
                    case "g":
                        if ("bounds".equalsIgnoreCase(SvgHelper.getStringAttr("id", attributes))) {
                            this.boundsMode = true;
                            break;
                        }
                        break;
                    case "svg":
                        Float floatAttr8 = SvgHelper.getFloatAttr("width", attributes);
                        Float floatAttr9 = SvgHelper.getFloatAttr("height", attributes);
                        if ((floatAttr8 == null || floatAttr9 == null) && (stringAttr = SvgHelper.getStringAttr("viewBox", attributes)) != null) {
                            String[] strArrSplit = stringAttr.split(" ");
                            Float fValueOf = Float.valueOf(Float.parseFloat(strArrSplit[2]));
                            floatAttr9 = Float.valueOf(Float.parseFloat(strArrSplit[3]));
                            floatAttr8 = fValueOf;
                        }
                        if (floatAttr8 == null || floatAttr9 == null) {
                            floatAttr8 = Float.valueOf(this.desiredWidth);
                            floatAttr9 = Float.valueOf(this.desiredHeight);
                        }
                        int iCeil = (int) Math.ceil(floatAttr8.floatValue());
                        int iCeil2 = (int) Math.ceil(floatAttr9.floatValue());
                        if (iCeil == 0 || iCeil2 == 0) {
                            iCeil = this.desiredWidth;
                            iCeil2 = this.desiredHeight;
                        } else {
                            int i3 = this.desiredWidth;
                            if (i3 != 0 && (i = this.desiredHeight) != 0) {
                                if (this.scaleMode == ScaleMode.ByWidth) {
                                    this.scale = i3 / iCeil;
                                } else {
                                    this.scale = Math.min(i3 / iCeil, i / iCeil2);
                                }
                                float f4 = this.scale;
                                iCeil = (int) (iCeil * f4);
                                iCeil2 = (int) (iCeil2 * f4);
                            }
                        }
                        SvgDrawable svgDrawable7 = this.drawable;
                        if (svgDrawable7 != null) {
                            svgDrawable7.width = iCeil;
                            svgDrawable7.height = iCeil2;
                            break;
                        } else {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, this.alphaOnly ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                            this.bitmap = bitmapCreateBitmap;
                            bitmapCreateBitmap.eraseColor(0);
                            Canvas canvas = new Canvas(this.bitmap);
                            this.canvas = canvas;
                            float f5 = this.scale;
                            if (f5 != 0.0f) {
                                float f6 = this.globalScale * f5;
                                canvas.scale(f6, f6);
                            }
                            break;
                        }
                        break;
                    case "defs":
                    case "clipPath":
                        this.boundsMode = true;
                        break;
                    case "line":
                        Float floatAttr10 = SvgHelper.getFloatAttr("x1", attributes);
                        Float floatAttr11 = SvgHelper.getFloatAttr("x2", attributes);
                        Float floatAttr12 = SvgHelper.getFloatAttr("y1", attributes);
                        Float floatAttr13 = SvgHelper.getFloatAttr("y2", attributes);
                        if (doStroke(new Properties(attributes, this.globalStyles))) {
                            pushTransform(attributes);
                            SvgDrawable svgDrawable8 = this.drawable;
                            if (svgDrawable8 != null) {
                                svgDrawable8.addCommand(new Line(floatAttr10.floatValue(), floatAttr12.floatValue(), floatAttr11.floatValue(), floatAttr13.floatValue()), this.paint);
                            } else {
                                this.canvas.drawLine(floatAttr10.floatValue(), floatAttr12.floatValue(), floatAttr11.floatValue(), floatAttr13.floatValue(), this.paint);
                            }
                            popTransform();
                            break;
                        }
                        break;
                    case "path":
                        Path pathDoPath = SvgHelper.doPath(SvgHelper.getStringAttr("d", attributes));
                        pushTransform(attributes);
                        Properties properties4 = new Properties(attributes, this.globalStyles);
                        if (doFill(properties4)) {
                            SvgDrawable svgDrawable9 = this.drawable;
                            if (svgDrawable9 != null) {
                                svgDrawable9.addCommand(pathDoPath, this.paint);
                            } else {
                                this.canvas.drawPath(pathDoPath, this.paint);
                            }
                        }
                        if (doStroke(properties4)) {
                            SvgDrawable svgDrawable10 = this.drawable;
                            if (svgDrawable10 != null) {
                                svgDrawable10.addCommand(pathDoPath, this.paint);
                            } else {
                                this.canvas.drawPath(pathDoPath, this.paint);
                            }
                        }
                        popTransform();
                        break;
                    case "rect":
                        Float floatAttr14 = SvgHelper.getFloatAttr("x", attributes);
                        if (floatAttr14 == null) {
                            floatAttr14 = Float.valueOf(0.0f);
                        }
                        Float floatAttr15 = SvgHelper.getFloatAttr("y", attributes);
                        if (floatAttr15 == null) {
                            floatAttr15 = Float.valueOf(0.0f);
                        }
                        Float floatAttr16 = SvgHelper.getFloatAttr("width", attributes);
                        Float floatAttr17 = SvgHelper.getFloatAttr("height", attributes);
                        Float floatAttr18 = SvgHelper.getFloatAttr("rx", attributes, null);
                        pushTransform(attributes);
                        Properties properties5 = new Properties(attributes, this.globalStyles);
                        if (doFill(properties5)) {
                            SvgDrawable svgDrawable11 = this.drawable;
                            if (svgDrawable11 != null) {
                                if (floatAttr18 != null) {
                                    svgDrawable11.addCommand(new RoundRect(new RectF(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + floatAttr15.floatValue()), floatAttr18.floatValue()), this.paint);
                                } else {
                                    svgDrawable11.addCommand(new RectF(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + floatAttr15.floatValue()), this.paint);
                                }
                            } else if (floatAttr18 != null) {
                                this.rectTmp.set(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + floatAttr15.floatValue());
                                this.canvas.drawRoundRect(this.rectTmp, floatAttr18.floatValue(), floatAttr18.floatValue(), this.paint);
                            } else {
                                this.canvas.drawRect(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + floatAttr15.floatValue(), this.paint);
                            }
                        }
                        if (doStroke(properties5)) {
                            SvgDrawable svgDrawable12 = this.drawable;
                            if (svgDrawable12 != null) {
                                if (floatAttr18 != null) {
                                    svgDrawable12.addCommand(new RoundRect(new RectF(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + floatAttr15.floatValue()), floatAttr18.floatValue()), this.paint);
                                } else {
                                    svgDrawable12.addCommand(new RectF(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + floatAttr15.floatValue()), this.paint);
                                }
                            } else if (floatAttr18 != null) {
                                this.rectTmp.set(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + floatAttr15.floatValue());
                                this.canvas.drawRoundRect(this.rectTmp, floatAttr18.floatValue(), floatAttr18.floatValue(), this.paint);
                            } else {
                                this.canvas.drawRect(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + floatAttr15.floatValue(), this.paint);
                            }
                        }
                        popTransform();
                        break;
                    case "style":
                        this.styles = new StringBuilder();
                        break;
                }
            }
        }

        private SVGHandler(int i, int i2, Integer num, boolean z, float f) {
            this(i, i2, num, z, f, ScaleMode.Default);
        }

        private SVGHandler(int i, int i2, Integer num, boolean z, float f, ScaleMode scaleMode) {
            this.scale = 1.0f;
            this.paint = new Paint(1);
            this.rect = new RectF();
            this.rectTmp = new RectF();
            this.globalScale = 1.0f;
            this.pushed = false;
            this.globalStyles = new HashMap<>();
            this.insideGiftRect = false;
            this.insideGiftRectDepth = 0;
            this.globalScale = f;
            this.desiredWidth = i;
            this.desiredHeight = i2;
            this.paintColor = num;
            this.scaleMode = scaleMode;
            if (z) {
                this.drawable = new SvgDrawable();
            }
        }
    }

    public static Bitmap getBitmap(int i, int i2, int i3, int i4, float f) {
        return getBitmap(i, i2, i3, i4, f, ScaleMode.Default);
    }

    public static Float getFloatAttr(String str, Attributes attributes, Float f) {
        String stringAttr = getStringAttr(str, attributes);
        if (stringAttr == null) {
            return f;
        }
        if (stringAttr.endsWith("px")) {
            stringAttr = SurfaceContainer$$ExternalSyntheticOutline0.m(2, 0, stringAttr);
        } else if (stringAttr.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(stringAttr));
    }

    public static Bitmap getBitmap(int i, int i2, int i3, int i4, float f, ScaleMode scaleMode) {
        try {
            InputStream inputStreamOpenRawResource = ApplicationLoader.applicationContext.getResources().openRawResource(i);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                SVGHandler sVGHandler = new SVGHandler(i2, i3, Integer.valueOf(i4), false, f, scaleMode);
                xMLReader.setContentHandler(sVGHandler);
                xMLReader.parse(new InputSource(inputStreamOpenRawResource));
                Bitmap bitmap = sVGHandler.getBitmap();
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
                return bitmap;
            } catch (Throwable th) {
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static SvgDrawable getDrawableByPath(Path path, int i, int i2) {
        try {
            SvgDrawable svgDrawable = new SvgDrawable();
            svgDrawable.commands.add(path);
            svgDrawable.paints.put(path, new Paint(1));
            svgDrawable.width = i;
            svgDrawable.height = i2;
            return svgDrawable;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static SvgDrawable getDrawable(int i, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(0, 0, num, true, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(ApplicationLoader.applicationContext.getResources().openRawResource(i)));
            return sVGHandler.getDrawable();
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Bitmap getBitmap(InputStream inputStream, int i, int i2, boolean z) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i, i2, z ? -1 : null, false, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(inputStream));
            return sVGHandler.getBitmap();
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Bitmap getBitmap(File file, int i, int i2, boolean z) {
        return getBitmap(file, i, i2, z, ScaleMode.Default);
    }

    public static Bitmap getBitmap(File file, int i, int i2, boolean z, ScaleMode scaleMode) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                SVGHandler sVGHandler = new SVGHandler(i, i2, z ? -1 : null, false, 1.0f, scaleMode);
                if (!z) {
                    sVGHandler.alphaOnly = true;
                }
                xMLReader.setContentHandler(sVGHandler);
                xMLReader.parse(new InputSource(fileInputStream));
                Bitmap bitmap = sVGHandler.getBitmap();
                fileInputStream.close();
                return bitmap;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Bitmap getBitmap(String str, int i, int i2, boolean z) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i, i2, z ? -1 : null, false, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return sVGHandler.getBitmap();
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }
}
